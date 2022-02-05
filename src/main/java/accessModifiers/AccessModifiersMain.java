package accessModifiers;

public class AccessModifiersMain {

    public static void main(String[] args) {
        sayHelloUsingDefault();
        sayHelloUsingPublic();
        sayHelloUsingPrivate();
    }

    /**
     * There are 4 access modifiers. PUBLIC, PRIVATE, PROTECTED and DEFAULT (no keyword)
     */

    /**
     * DEFAULT
     * <p>
     * Kai nepridedam jokio access modifier Java automatiskai padarys kintamaji ar metodo default access
     * Default == package-private modifier
     */

    static void sayHelloUsingDefault() {
        System.out.println("Greatings with DEFAULT access!");
    }


    /**
     * PUBLIC
     * <p>
     * Jei pridedam PUBLIC raktazodi (keyword) prie klases, metodo, lauko (field)tada visas pasaulis gali matyt
     * Visas kitas klases, klases esancias kituose package gali pasiekti ir naudoti ta resursa.
     * Tai yra "maziausiai saugus" access modifieris.
     */

    public static void sayHelloUsingPublic() {
        System.out.println("Greetings with PUBLIC access!");

    }
    /*
    *PRIVATE
    *
    * Betkoks metodas, laukas, constructorius, su PRIVATE keywordu yra pasiekiamas tik is TOS PACIOS KLASES
     */

    private static void sayHelloUsingPrivate() {
        System.out.println("Greetings with PRIVATE access!");
    }

    /**
     *  PROTECTED
     *
     *  "Tarpinis" saugumo kontroliavimo variantas tarp Public ir Private.
     *
     *  Jei laukas, metodas yra pazymetas PROTECTED access modifier, tai mes ji galime pasiekti is to pacio
     *  PACKAGE (kaip ir package-private access modifier) ir papildomai visose VAIKINESE klasese,
     *  kurios extendina tevine klase.
     */

    protected static void sayHelloUsingProtected() {
        System.out.println("Greetings with PROTECTED");
    }
}