import twitter4j.*;

public class BotLottery {

    public static void main(String args[])
    {
        BotLotteryFunctions BLF = new BotLotteryFunctions();
        BLF.gatherTweets();
        Status winner = BLF.selectWinner();
        BLF.mentionWinner(winner);

        try {
            Thread.sleep(7200000);          //wait 2 hours
        } catch(InterruptedException i){}

        main(null);                         //restart the lottery
    }
}
