package TestNG.Day17;

import org.testng.annotations.DataProvider;

public class ExternalDataProvider {

        @DataProvider(name = "searchData")
        public Object[][] getSearchKeywords() {
            return new Object[][] {
                    {"Selenium"},
                    {"TestNG"},
                    {"Java"}
            };
        }
    }


