<p align="center">
<a href="https://www.senamasoft.com/"> <img width=70%" src="media/senamaSoftLogo.png"> </a></h1>
<p align="center">

# <p align="center"> Проект по автоматизации тестовых сценариев для <a href="https://www.senamasoft.com/"> SenamaSoft</a> <p align="center">

## Использованный стек технологий
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/Intelij_IDEA.svg">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/Java.svg">
<a href="https://ru.selenide.org/"><img width="6%" title="Selenide" src="media/Selenide.svg">
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="media/Selenoid.svg">
<a href="https://allurereport.org/"><img width="6%" title="AllureReport" src="media/AllureReport.png">
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/AllureTestOps.svg">
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/Gradle.svg">
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/JUnit5.svg">
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/GitHub.svg">
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/Jenkins.svg">
<a href="https://web.telegram.org/a/"><img width="6%" title="Telegram" src="media/Telegram.svg">
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/Jira.svg">
</p>

- В данном проекте автотесты написаны на языке <code>Java</code>  с использвоанием фреймворка для тестирования Selenide
- В качестве сборки был использован <code>Gradle</code>
- Использованы фреймворки <code>JUnit 5</code> и [Selenide](https://selenide.org/).
- При прогоне тестов браузер запускается в [Selenoid](https://aerokube.com/selenoid/).
- Для удаленного запуска реализована джоба в Jenkins с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота.
- Осуществлена интеграция с <code> Allure TestOps </code> и <code>Jira</code>.

## Cодержание:
- [Стек технологий](#-Стек-технологий)
- [Тестовые сценарии](#-Тестовые-сценарии)
- [Сборка в Jenkins](#-Сборка-в-Jenkins)
- [Команда для запуска тестов в терминале](#-Команды-запуска-тестов-в-терминале)
- [Allure отчет](#-Allure-отчет)
- [Интеграция с Allure TestOps](#-Интеграция-с-Allure-testOps)
- [Интеграция с Jira](#-Интеграция-с-Jira)
- [Уведомления в Telegram чат с ботом](#-Уведомления-в-Telegram-чат-с-ботом)
- [Видео запуска тестов в Selenoid](#-Видео-запуска-тестов-в-Selenoid)

## Тестовые сценарии:
- Проверка работоспособности главной страницы
- Проверка работоспособности разделов: Services, Portfolio, Contacts, Career, Testimonials
- Проверка содержания главных кнопок при изменении языка
- Успешное заполнение формы Get in touch
- Неуспешное заполнение формы Get in touch

## <img alt="Jenkins" height="25" src="media/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/senama-soft-project/)


<p align="center">  
<img src="media/JenkinsResult.png" alt="Jenkins" width="950"/></a>  
</p>

## 📋 Параметры сборки в Jenkins:

- _REMOTE_LINK (URL Selenoid, по умолчанию selenoid.autotests.cloud)_
- _TASK (Задачи, по умолчанию test)_
- _BROWSER (Браузер, по умолчанию chrome)_
- _BROWSER_VERSION (Версия браузера, по умолчанию 100.0)_
- _BROWSER_SIZE (Размер окна браузера, по умолчанию 1920x1080)_

### Запуск тестов с параметрами в **Jenkins**

<p align="center">
<img src="media/JenkinsLaunch.png" alt="Jenkins Launch" width="1000" height="400">
</p>

---
## Команда для запуска

```
clean
${TASK}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteLink=https://${REMOTE_LINK}/wd/hub
```

---

## <img src="media/AllureReport.png" width="50" height="50"/> [Allure](https://jenkins.autotests.cloud/job/senama-soft-project/16/allure/) отчет

### Главная страница отчета 

<p align="center">
<img src="media/AllureScreen.png" alt="Allure report" width="900" height="350">
</p>

### Тест-кейсы

<p align="center">
<img src="media/AllureTestCases.png" alt="Test case" width="900" height="350">
</p>

####  Содержание тест-кейсов 

- Подробное описание шагов
- Тег
- Критичность теста
- Автор
- Послдений скриншот для каждого теста 
- HTML разметка страницы
- Логи браузера 
- Видео с прохождением теста

---

## <img src="media/AllureTestOps.svg" width="50" height="50"/> Интеграция с [AllureTestOps](https://allure.autotests.cloud/project/3690/dashboards)

### Dashboard

<p align="center">
<img src="media/dashboard.png" alt="TestOps dashboard" width="900" height="400">
</p>

### Ручные и автоматизированные тест-кейсы

<p align="center">
<img src="media/TestOpsTestCases.png" alt="TestOps launch" width="900" height="400">
</p>

## <img src="media/Jira.svg" width="50" height="50"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-900)

<p align="center">
<img src="media/Jira-900.png" alt="Jira" width="900" height="400">
</p>

---

## <img src="media/Telegram.svg" width="50" height="50"/> Уведомление в Telegram чат при помощи бота

### Уведомление из переписки с чат ботом

<p align="center">
<img src="media/TelegramBot.png" alt="Telegram" width="600" height="400">
</p>

---

## <img src="media/Selenoid.svg" width="50" height="50"/> Видео запусков теста в Selenoid

<p align="center">
<img src="media/SelenoidVideo.gif" alt="Selenoid video" width="900" height="400">
</p>







