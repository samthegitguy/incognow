import com.jaunt.*;
public class SecurityCheck {
    public void Checker() throws JauntException {
        UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)
        //print the userAgent's default settings.
        userAgent.settings.autoSaveJSON = true;        //change settings to autosave last visited page.
    
        userAgent.sendGET("https://samthegitguy.github.io/password-manager-one/securitystatus.json");   //send request
        JNode CriticalPatch = userAgent.json.findFirst("CriticalPatch");
        if (CriticalPatch != null) {
            throw new SecurityException("A critical patch is available, program cannot continue without this update. Please go to https://github.com/samthegitguy/password-manager-one/archive/master.zip to download."); 
        }   
    }
}
