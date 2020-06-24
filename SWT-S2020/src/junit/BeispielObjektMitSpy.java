package junit;

import java.util.Map;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Tino B�hmke
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514997@beuth-hochschule.de
 * @MatrikelNummer: 776097
 * @Datum 24.06.2019
 */

public class BeispielObjektMitSpy {

	/**
	 * kleines Beispiel f�r Zugriffsberechtigung. Der Spy soll in diesem Fall
	 * pr�fen, ob die Methode PermissionChecker ausgef�hrt wurde
	 */

	private PermissionChecker permissionChecker = Mockito.spy(new PermissionChecker()); // Mockito.spy legt den Proxy
	// au�en rum

	@Test
	public void testVerify() {

		// given
		Map myMap = Mockito.mock(Map.class);

		// when
		storeToDatabase(myMap);

		Mockito.verify(permissionChecker).checkHasPermisson();
	}

	// then
	private void storeToDatabase(Map myMap) {

		// verifiziert ob der PermissonChecker benutzt wurde

		permissionChecker.checkHasPermisson();
		myMap.get(0);
	}

	private class PermissionChecker {

		// speichert intern, welcher User-Rolle hat er Nutzer, der grade eingeloggt ist

		private String currentUserRole = "Admin";

		// pr�ft, wenn Nutzer Rolle nicht Admin, dann keinen Zugriff

		void checkHasPermisson() {
			if (!currentUserRole.equals("Admin")) {
				throw new IllegalStateException("access not allowed");
			}
		}
	}

}