package pages
import geb.Page
class HomePage extends Page {

    def t�tulo = "ResS"
    static url = "/ResS"

    static at = {
        title ==~ t�tulo
    }

    def selectResidueGeneratorArea(){
        $('#ResidueGenerator').click();
    }

    def selectGithubRibbon(){
        $('#forkongithublink').click();
    }
}
