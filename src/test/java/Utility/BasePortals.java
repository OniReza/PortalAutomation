package Utility;

public class BasePortals {

    public static String portalsDEV()
    {

        Portals.dev dev = new Portals.dev();
        String PortalDev=dev.debtboxDv();
        String username = "devs";
        String password = "super!power";
        String URLDEV = "https://" + username + ":" + password + "@" + PortalDev;
        return URLDEV;
    }

    public static String portalsTST()
    {
        Portals.tst tst = new Portals.tst();
        String PortalTst = tst.debtbox();
        String username = "sandbox";
        String password = "test!easy";
        String URLTST = "https://" + username + ":" + password + "@" + PortalTst;
        return URLTST;
    }

}
