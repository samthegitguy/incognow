import com.jaunt.*;
public class SecurityCheck {
    public void Checker(final String unserialized) throws JauntException {
        try {
            UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)
            System.out.println("SETTINGS:\n" + userAgent.settings);      //print the userAgent's default settings.
            userAgent.settings.autoSaveJSON = true;        //change settings to autosave last visited page.
        
            userAgent.sendGET("https://samthegitguy.github.io/password-manager-one/securitystatus.json");   //send request
            JNode CriticalPatch = userAgent.json.findFirst("CriticalPatch");
            System.out.println("CriticalPatch: " + CriticalPatch);	
        } catch (JauntException e) {
            System.out.println("Could not find page!");
            System.err.println("[ERR] " + e);
        }      
    }   
}
