
public class TestCodeSeg {
    static {
        System.out.println("1");
    }
         public TestCodeSeg() {
                 System.err.println("3");
             }
    {
        System.out.println("2");
    }
             public static void main(String[] args)
             {
                 new TestCodeSeg();
             }
         }


