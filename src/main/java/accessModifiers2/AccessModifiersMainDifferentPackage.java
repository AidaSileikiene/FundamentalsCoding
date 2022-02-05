package accessModifiers2;

import accessModifiers.AccessModifiersMain;

public class AccessModifiersMainDifferentPackage {

    public static void main(String[] args) {
      //  AccessModifiersMain.sayHelloUsingDefault(); negaliu pasiekti package-private metodo kitame package
        AccessModifiersMain.sayHelloUsingPublic(); //pasiektas, nes nustatytas public access modifiers
        //AccessModifiersMain.sayHelloUsingPrivate();//negaliu pasiekti kitu klasiu PRIVATE metodu
    }
}
