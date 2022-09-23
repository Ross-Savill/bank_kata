package org.asos.bank;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)

public class AppTest extends ScenarioTest<GivenSomeState, WhenSomeAction, ThenSomeOutcome> {

    @Mock
    Transaction transaction;

    @Test
    public void acceptanceTest() {
        given().aClientMakesADepositOf(1000, "19/09/2022");
        given().aClientMakesADepositOf(2000, "20/09/2022");
        given().aClientMakesAWithdrawlOf(500, "21/09/2022");
        when().shePrintsHerStatement();
        then().sheShouldSeeCorrectlyFormattedStatement();
    }
}
