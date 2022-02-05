package accessModifiers;

public class AccessModifiersSamePackage {

    public static void main(String[] args) {
        AccessModifiersMain.sayHelloUsingDefault();//pasiektas per package-private modifier.Nes tas pats package
        AccessModifiersMain.sayHelloUsingPublic(); //pasiektas per public modifier
        //AccessModifiersMain.sayHelloUsingPrivate();//negaliu matyti kitos klases PRIVATE modifier metodo.
        AccessModifiersMain.sayHelloUsingProtected();//Tame paciame package.

    }
}
