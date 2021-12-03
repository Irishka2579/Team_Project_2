package com.company.TeamProject2.Task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
  interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot {
    void navigate();}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening  Chrome Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing  Chrome Driver");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot in the Chrome Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome Driver");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening FireFox driver");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox driver");
    }

    @Override
    public String getTitle() {
        return "FireFox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot in the FireFox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to FireFox driver");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening  Safari driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari driver");
    }

    @Override
     public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot in Safari driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Safari driver");
    }
}
class Tester{
    public static void main(String[]args){
        RemoteWebDriver[]webs={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver w:webs){
            w.open();
            w.close();
           System.out.println(w.getTitle());
            w.getScreenshot();
            w.navigate();

        }
    }
}