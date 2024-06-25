# Проект по автоматизации проверок основного функционала AI генератора картинок от Spans
<img width="100%" title="Java" src="mediaReadme/logo/main.png">


## :scroll: Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Список тестов проекта](#computer-список-тестов-проекта-funpay)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Видео примера запуска тестов в Selenoid](#-Selenoid--Видео-прохождения-теста-в-отчете)

## :computer: Используемый стек

<p align="center">
<a href="https://www.java.com/"><img width="12%" title="Java" src="mediaReadme/logo/Java.svg">
<a href="https://selenide.org/"><img width="12%" title="Selenide" src="mediaReadme/logo/Selenide.svg">
<a href="https://aerokube.com/selenoid/"><img width="12%" title="Selenoid" src="mediaReadme/logo/Selenoid.svg">
<a href="https://github.com/allure-framework/allure2"><img width="12%" title="Allure Report" src="mediaReadme/logo/Allure_Report.svg">
<a href="https://gradle.org/"><img width="12%" title="Gradle" src="mediaReadme/logo/Gradle.svg">
<a href="https://junit.org/junit5/"><img width="12%" title="JUnit5" src="mediaReadme/logo/JUnit5.svg">
<a href="https://github.com/"><img width="12%" title="GitHub" src="mediaReadme/logo/GitHub.svg">

</p>

- Язык для написания тестов : [Java](https://www.java.com/ru/)
- Фреймвокр тестирования : [Selenide](https://selenide.org/) 
- Фреймворк для модульного тестирования : [Junit5](https://github.com/junit-team/junit5)
- Система автоматической сборки : [Gradle](https://github.com/gradle) 
- Для использования различных браузеров в тестировании : [Selenoid](https://aerokube.com/selenoid/).
- Отчеты о пройденных тестах формируются при помощи : [Allure](https://github.com/allure-framework)

## :computer: Список auto-тестов проекта 
* Проверка успешной авторизации с подготовленными тестовыми данными
* Проверка успешной авторизации с тестовыми сгенерированными данными
* Проверка выбора и отображения случайной картинки
* Проверка удаления всех картинок и появление Pop-up
* Проверка загрузки картинки на сервис
* Проверка функционала фильтров для картинок в галерее


## :arrow_forward: Запуск автотестов

### Команда запуска тестов локально в IDE
* <code>gradle allTests -Dhost=local </code> : Запуск всех тестов 
* <code>gradle mainPageTests -Dhost=local </code> : Запуск тестов главной страницы
* <code>gradle authPageTests -Dhost=local</code> : Запуск тестов на странице авторизации

### Команда запуска тестов удалённо 
```
* <code>gradle allTests -Dhost=remote </code> : Запуск всех тестов 
* <code>gradle mainPageTests -Dhost=remote </code> : Запуск тестов главной страницы
* <code>gradle authPageTests -Dhost=remote </code> : Запуск тестов на странице авторизации
```
При запуске удалённо тест будет выполняться удаленно в браузере при помощи <code>Selenoid</code>

## <img width="7%" style="vertical-align:middle" title="Allure Report" src="mediaReadme/logo/Allure_Report.svg"> Пример [Allure-отчета](https://jenkins.autotests.cloud/job/Pikabu_UI_Project/32/allure/)
### Overview

<p align="center">
<img title="Allure Overview" src="mediaReadme/screens/AllureReports.jpg">
<img title="Allure Overview" src="mediaReadme/screens/AllureReport2.jpg">
</p>

### <img width="7%" style="vertical-align:middle" title="Selenoid" src="mediaReadme/logo/Selenoid.svg"> Selenoid : Видео прохождения теста в отчете

При интеграции с <code>AllureReports</code> вместе с общим результатом  тест-кейса прикладываются media файлы : скриншот и видео. Вот пример видео в отчете о завершенном тесте: 
<p align="center">
  <img title="Selenoid Browser Video" src="mediaReadme/gif/SelenoidTest.gif">
</p>
