package com.loop.test.day07_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtilities;
import org.testng.annotations.Test;

public class T0_login_docuport extends TestBase {

    @Test
    public void test_login_logout(){
        DocuportUtilities.login(driver, DocuportConstants.ADVISOR);
        DocuportUtilities.logOut(driver);
    }

}
