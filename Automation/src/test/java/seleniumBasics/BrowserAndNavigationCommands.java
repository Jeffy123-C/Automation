package seleniumBasics;

public class BrowserAndNavigationCommands extends Base{
	public void browserCommand() {
		String title=driver.getTitle();
		System.out.println(title);
		String source=driver.getPageSource();
		System.out.println(source);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserAndNavigationCommands command=new BrowserAndNavigationCommands();
command.initializeBrowser();
command.browserCommand();

	}

}
