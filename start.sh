echo "---------------------inicializando projeto----------------------------"
cd /projects/console-java-simple/
mvn dependency:resolve
mvn clean install -U
mvn eclipse:eclipse
echo "-------------------criando pastas-----------------------"
cd /home/user/
mkdir inicio
mkdir fim
echo "bla" > ./inicio/bla.txt
