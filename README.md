###Przykład uruchomienia:
    java -DdatabaseUrl=jdbc:mysql://localhost:3306/sklep -DdatabaseUser=root -DdatabasePassword= -DtestDatabase=true -jar sklep.jar

baza danych podczas uruchomienia musi być pusta, aplikacja sama tworzy odpowiednie tabele
parametr testDatabase ustawiony na true dodaje podczas tworzenia tabel dane testowe

###Użytkownicy
##Admin
    Login: janKowalski
    Hasło: 1234
##Zwykły użytkownik
    Login: krzysztofNowak
    Hasło: 1234

Do uruchomienia wymagana java 8