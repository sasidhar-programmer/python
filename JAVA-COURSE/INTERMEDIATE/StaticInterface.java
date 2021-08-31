interface STatic { 
    static void new_test() {  //static in Interface 
        System.out.println("static in interface"); 
    }
}


public class StaticInterface { 
    public static void main(String[] args) {
        STatic.new_test();
    }
    
}