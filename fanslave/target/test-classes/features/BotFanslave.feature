Feature:Fanlave

        Scenario Outline: Fanslave
            Given el usuario esta logeado con "<usuario>" y "<password>"
             When el usuario accede a la pagina de trabajo y comienza a trabajar
             Then el usuario termina el trabajo por hoy
        Examples:
                  | usuario | password |
                  | tu5464  | 56454654 |

