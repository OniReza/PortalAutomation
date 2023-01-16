package Utility;

import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

public class BaseData {

    static String  clubswanDev= "member.dev.clubswan.com";
    static String  clubswanTst= "member.tst.clubswan.com";
    static String  aubitpayDev = "dev.aubitpaymembers.com";
    static String  aubitpayTst = "sandbox.aubitpaymembers.com";
    static String  ardupayDev = "dev.ardupaymembers.com";
    static String  ardupaytst = "sandbox.ardupaymembers.com";
    static String  akashxDev = "dev.akashx.clubswan.com";
    static String  akashxtst = "tst.akashx.clubswan.com";
    static String  auraeDev= "member.dev.auraelifestyle.com";
    static String  auraeTst= "member.tst.auraelifestyle.com";
    static String  amwalletDev= "dev.amcardmembers.com";
    static String  amwalletTst= "sandbox.amcardmembers.com";
    static String  clubphnxDev= "dev.clubphoenixmembers.com";
    static String  clubphnxTst= "sandbox.clubphoenixmembers.com";
    static String  coinovyDev= "dev.coinovymembers.com";
    static String  coinovyTst= "sandbox.coinovymembers.com";
    static String  cashftDev= "dev.cashftmembers.com";
    static String  cashftTst= "sandbox.cashftmembers.com";
    static String  earnguildDev= "dev.earnguildcard.com";
    static String  earnguildTst= "sandbox.earnguildcard.com";
    static String  endpointDev= "dev.endpointmembers.com";
    static String  endpointTst= "sandbox.endpointmembers.com";
    static String  gslDev= "dev.gslifestylecard.com";
    static String  gslTst= "tst.gslifestylecard.com";
    static String  infinityDev= "dev.infinityclubcardmembers.com";
    static String  infinityTst= "sandbox.infinityclubcardmembers.com";
    static String  hodlDev= "dev.hodl.clubswan.com";
    static String  hodlTst= "sandbox.hodl.clubswan.com";
    static String  midasDev= "dev.midas.clubswan.com";
    static String  midasTst= "tst.midas.clubswan.com";
    static String  milioDev= "dev.miliomembers.com";
    static String  milioTst= "sandbox.miliomembers.com";
    static String  pagosDev= "dev.pagosrd.com";
    static String  pagosTst= "sandbox.pagosrd.com";
    static String  plcuDev= "dev.plcumember.com";
    static String  plcuTst= "sandbox.plcumember.com";
    static String  suissecapDev= "dev.wallet-suissecapital.com";
    static String  suissecapTst= "tst.wallet-suissecapital.com";
    static String  triviDev= "dev.trivi.clubswan.com";
    static String  triviTst= "tst.trivi.clubswan.com";
    static String  worldclubDev= "dev.wallet-worldclub.com";
    static String  worldclubTst= "tst.wallet-worldclub.com";
    static String  owlDev= "dev.owl-lifestyle.com";
    static String  owlTst= "sandbox.owl-lifestyle.com";
    static String  dreamwalletDev= "dev.dreamwallet.clubswan.com";
    static String  dreamwalletTst= "tst.dreamwallet.clubswan.com";
    static  String Digipro="dev.lyopaymembers.com/";
    static  String DigiproTst="sandbox.lyopaymembers.com/";
    static  String Neurotrade="dev.neurotrademember.com/";
    static  String NeurotradeTst="sandbox.neurotrademember.com/";

    public static String BaseUrlMain() {

        String PortalDev= BasePortals.portalsDEV();
        String PortalTst= BasePortals.portalsTST();

//        String URL =PortalDev;
        String URL =PortalTst;
        return URL;

    }

    public static String BasePopUpUrl()
    {
        String PortalDev= BasePortals.portalsDEV();
        String PortalTst= BasePortals.portalsTST();

        String PURL = PortalDev;
//        String PURL =PortalTst;
        return PURL;
    }

    public static String BaseEmail(){
//        String Email="clubswan_non-us_devqyxx@mailinator.com";
//          String Email="rashed.mahmud@springrain.io";//Rashed
          String Email="stalin.neurotrade.tst.1@mailinator.com"; //Neotrade
//        String Email="clubswan_us_dev_marina@mailinator.com";
//        String Email = "test_PLCU_dev@mailinator.com";
//        String Email = "clubswan_us_tst_rtl_18@mailinator.com"; //cs tst
//        String Email = "test_clubswan_US_tst@grr.la"; //cs tst
//        String Email="stalin.icc.tst.3@mailinator.com";//Stalin
//        String Email="testphp1@mailinator.com"; //php portal
//          String Email="infinity_uk_tst_aut_angie@mailinator.com";

//          String Email="hodl_us_dev_d9@mailinator.com";
//        String Email="clubswan_fra_dev_d31@mailinator.com";
        return Email;
    }
    public static String BasePassword(){
       // String Password = "Tt123#123";
        String Password = "Tt123#123#";
        return Password;
    }
    public static String BaseOtp() {

//        String secretKey = "ROTBDJNQRXO3NUJMH5E37ZWBEA";
//        String secretKey = "I3P7OM4QWVTAJMRFKWU5YCPB24"; //cs tst 18
//        String secretKey = "I4BDIRMSMJUR6CWSEZ2DMF2I4E"; //cs dev
//        String secretKey = "E2KW4F4D3P656NV7HYXVMSRSLY"; //PLC dev
//        String secretKey = "XCFX7E3B6XFXSGKGMGRPQAIIEQ"; //rifa
//        String secretKey = "GMN2ETS35OSX575RNQFKLA3A5Y"; //rashed
//        String secretKey="MFV5OMU7KCCKQN6SDJESMD3DKE"; //Club Swan
//        String secretKey = "MW73YZSM5Q4YWTBGCY7X2ZWYXU";//Stalin
//        String secretKey="ICQ3OLQHPQAEU7G2QHUK3DF5E4"; //Php Portal
//        String secretKey = "EXVXUQPBJMVWC7RUWEL2BIUOKI";//Php Portal
//        String secretKey="ZNPOHASCFTKK7W3YVQXAZY4XOE";//HODL
//        String secretKey = "XEWKO5TR7VSOZQTCB4TC2ZQBXY";
        //String secretKey="RAQ36UGZ4N6ELJMKT6YVI6WQDU";
        String secretKey = "6UNVY5GUBZIYMVIW4UZBLXTGO4";//Neotrade
        String code = getTOTPCode(secretKey);
        return code;

    }
    private static String getTOTPCode(String secretKey) {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        String x= TOTP.getOTP(hexKey);
        System.out.println("Totp: "+ TOTP.getOTP(hexKey));
        return TOTP.getOTP(hexKey);
    }
    //Apexx
    public static String cardNumber() {
        String number = "5200000000001005";
        //String number = "4456530000001005";
        return number;
    }
    public static String cardMonth() {
        String month = "11";
        return month;
    }
    public static String cardYear() {
        String year = "31";
        return year;
    }
    public static String cardCvv() {
        String cvv = "003";
        return cvv;
    }

//Stripe
public static String stripeCardNumber() {
    String number = "5555555555554444";
    return number;
}
    public static String stripeCardExpiry() {
        String date = "1130";
        return date;
    }

}
