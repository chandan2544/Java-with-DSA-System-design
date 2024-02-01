// interface helps to make reduce the  dependency during designing software

interface computer {
    void compileCode();
}

class Laptop implements computer {
    public void compileCode() {
        System.out.println("you got 5 errors");
    }
}

class Desktop implements computer {
    public void compileCode() {
        System.out.println("you got 5 errors , faster ");
    }
}

class Developer {
    public void buildApp(computer obj) {
        System.out.println("Build app");
        obj.compileCode();
    }
}

public class main {
    public static void main(String[] args) {
        // Laptop obj = new Laptop();
        computer obj = new Desktop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}