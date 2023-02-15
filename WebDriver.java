package Homework25;

public interface WebDriver {

    //  Create a WebDriver Interface that will have the following unimplemented behaviour:
    //  openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    //  Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}


    class ChromeDriver implements WebDriver{

        @Override
        public void openBrowser() {
            System.out.println("Open browser");

        }

        @Override
        public void closeBrowser() {
            System.out.println("Close browser");

        }

        @Override
        public void maximizeWindow() {
            System.out.println("MaximizeWindow");

        }

        @Override
        public void findElement() {
            System.out.println("Find element");
        }
    }

     class FireFoxDriver implements WebDriver{


         @Override
         public void openBrowser() {
             System.out.println("Open browser");

         }

         @Override
         public void closeBrowser() {
             System.out.println("Close browser");

         }

         @Override
         public void maximizeWindow() {
             System.out.println("MaximizeWindow");

         }

         @Override
         public void findElement() {
             System.out.println("Find element");

         }

         public static void main(String[] args) {

             WebDriver[] webDrivers = {new ChromeDriver(), new FireFoxDriver()};

             for (WebDriver wd:webDrivers){

                 wd.openBrowser();
                 wd.closeBrowser();
                 wd.maximizeWindow();
                 wd.findElement();
             }
         }
     }


