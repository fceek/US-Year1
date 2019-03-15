public class MusicTest
{
    public MusicTest()
    {
        MusicOrganizer runner = new MusicOrganizer();
        
        runner.addFile("Errrrrrr");
        runner.addFile("Yeeeeeee");
        runner.addFile("Waaaaaaa");
        
        runner.getNumberOfFiles();
        
        runner.listAllFiles();
        
        runner.listFile(5);
        runner.listFile(-1);
        runner.listFile(1);
        
        runner.removeFile(5);
        runner.removeFile(-1);
        runner.removeFile(1);
        
        runner.listAllFiles();
    }
}
