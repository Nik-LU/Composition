# Игра-викторина 

Классическое Android-приложение, созданное для демонстрации архитектурного подхода и работы с базовыми Android-компонентами.

<p align="center">
  <img src="https://github.com/user-attachments/assets/21588659-cb11-486d-80d3-49758b355b9a" width="250" />
</p>

---

## Запуск
1. Склонировать репозиторий
2. Открыть проект в Android Studio
3. Запустить конфигурацию `app`

---

## Стек
- Kotlin
- **UI:** XML + DataBinding
- **Screens:** Single-Activity + Fragments
- **Navigation:** Navigation Component (Navigation Graph)
- **Presentation:** ViewModel + LiveData
- **Architecture:** Clean (data / domain / presentation)

---

## Навигация

Приложение построено по Single-Activity подходу.    
Все экраны реализованы через Fragment’ы и связаны с помощью Navigation Graph.

---

## Назначение проекта
Проект создан для демонстрации:
- разделения ответственности
- работы с Navigation Component
- базовой архитектуры экрана на ViewModel + DataBinding
