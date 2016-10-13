### FileChest
----
API de cadastro e gerenciamento de Arquivos.

#### Funcionalidades
----
* CRUD de Usuários
* CRUD de Arquivos

#### Pré-requisitos
----
|  Ferramenta  |  Versão   |
| -----------  | --------  |
|     Java     |    8      |
|    Tomcat    |    8      |
|    Mysql     |    - 	   |

#### Instalação
----
1.Clonar repositório:
```
$[localhost git] git clone git@github.com:diegoAntonio/FileChest.git
```
2.Criar arquivos de configuração da IDE Eclipse:
```
$[localhost fileChest] ./gradlew build eclipse
```
3.Importar o projeto para a IDE Eclipse

   File -> Import Project
```
4.Criar os respectivos bancos no mysql, fileChest(produção) e fileChestTest(testes).
