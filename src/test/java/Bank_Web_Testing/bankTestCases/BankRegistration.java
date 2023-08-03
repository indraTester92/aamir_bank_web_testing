package Bank_Web_Testing.bankTestCases;

import org.testng.annotations.Test;

import Bank_Web_Testing.bankPageObjects.BankRegistration_Page;
import Bank_Web_Testing.basicUtilities.CommonTest;

public class BankRegistration extends CommonTest 
{
    BankRegistration_Page BnkRegistration;
    
    @Test
    public void registration()
    {
        BnkRegistration = new BankRegistration_Page(driver);
        BnkRegistration.registerProfile();

        BnkRegistration.registerationCheck();
    }
}
