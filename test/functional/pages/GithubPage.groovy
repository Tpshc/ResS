package pages

import geb.Page

class GithubPage extends Page {

    def t�tulo = "pauloborba/ResS � GitHub"
    static url = "https://github.com/pauloborba/ResS"

    static at = {
        title ==~ t�tulo
    }
}
