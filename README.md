<div align="center">
 HepsiBuradaWebTestProject
</div>

# **SELENIUM WEB //Intelij //MVN //JUNIT // TESTNG // CUCUMBER 
# AllSteps Hepsiburada WithLogin Scenario 
**Tags:chrome**
1. [+] **Çerezler Kabul Edilir.**
2. [+] **Kullanıcı Hepsiburada.com sitesini Ziyaret Eder.**
3. [+] **Kullanıcı Giriş İşlemi Yapılır.**
4. [+] **Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır.**
5. [+] **Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer..**
6. [+] **Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.**
7. [+] **Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanır.**



# AllSteps Hepsiburada WithNothLogin Scenario 
**Tags:chrome**
1. [+] **Çerezler Kabul Edilir.**
2. [+] **Kullanıcı Hepsiburada.com sitesini Ziyaret Eder.**
3. [+] **Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer..**
4. [+] **Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.**
5. [+] **Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanır.**

# **Presentation
https://www.loom.com/share/c5bc89c0480849ba835e0dd39eadfb81

# **Demo
https://user-images.githubusercontent.com/89300182/199294073-0333d4af-1972-45be-9c48-905d4198ad60.mp4

# **Project using just JUNIT/Maaven with same scenario 
https://github.com/numanakoluk/A101TestFinalCaseJunit

# Log4j.properties 
![image](https://user-images.githubusercontent.com/89300182/198880629-c5844989-ab5e-4753-9fcc-e364e2042b72.png)

# cucumber.html(Reports)

![image](https://user-images.githubusercontent.com/89300182/198880702-725d4f21-1213-47e7-93a2-adcae6ca1fa8.png)

# pom.xml
 
 <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>hepsiburada-java-cucumber</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.7.0</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>3.7.1</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>6.7.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.10.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>6.6.0</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/log4j/log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>

    </dependencies>
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
    </build>
</project>

 ```
