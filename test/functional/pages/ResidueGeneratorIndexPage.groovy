package pages
import geb.Page

class ResidueGeneratorIndexPage extends Page {

    def t�tulo = "Residue Generator List"
    static url = "/ResS/residueGenerator/list"

    static at = {
        title ==~ t�tulo
    }

}
