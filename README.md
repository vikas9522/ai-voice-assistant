# 🎙️ AI Voice Assistant

A modern JavaFX-based desktop AI assistant powered by Sarvam AI API.

![Java](https://img.shields.io/badge/Java-21-orange)
![JavaFX](https://img.shields.io/badge/JavaFX-UI-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 🚀 Features

- 💬 Chat-based AI interaction
- 🖥️ Clean JavaFX GUI
- 🔐 Secure API key handling using environment variables
- ⚡ Fast Maven-based build

---

## 🛠️ Tech Stack

- Java 21
- JavaFX
- Maven
- Sarvam AI API
- REST API Integration

---

## 📦 Project Structure
ai-voice-assistant
│
├── src/main/java/com/vikas/assistant
│ ├── Main.java
│ ├── AIService.java
│
├── pom.xml
├── .gitignore
└── README.md


---

## 🔑 Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/ai-voice-assistant.git
cd ai-voice-assistant

2️⃣ Set Environment Variable (IMPORTANT)

Windows (PowerShell):

setx SARVAM_API_KEY "your_api_key_here"

Mac/Linux:

export SARVAM_API_KEY="your_api_key_here"


Restart terminal after setting.

3️⃣ Run the Application
mvn clean javafx:run
🏗️ Build Executable JAR
mvn clean package

JAR file will be inside:

target/ai-voice-assistant-1.0-SNAPSHOT.jar

Run it:

java -jar target/ai-voice-assistant-1.0-SNAPSHOT.jar

Screenshots
After running the Run.bat file in you system cmd will run: 
<img width="1070" height="606" alt="Screenshot_20260220_215845" src="https://github.com/user-attachments/assets/dec96cab-6955-442b-858a-4ae77587c6b1" />


And this GUI Interface will open
<img width="747" height="667" alt="{24630CAD-17E4-4232-B8BE-133B9EF28F53}" src="https://github.com/user-attachments/assets/a94d60d0-2a88-418f-acec-ffca8dd2f37b" />

for input provide in the bottom field

And the result is below
<img width="737" height="664" alt="{E2F8FD7D-E6C5-44E1-A093-26F57D54A56B}" src="https://github.com/user-attachments/assets/7020e005-4aac-4228-9f45-d77bc16406a9" />

Future Improvements

Add speech-to-text

Add text-to-speech

Improve UI styling

Add conversation history storage

Create installer using jpackage

👨‍💻 Author

Vikas

⭐ Support

If you like this project, give it a ⭐ on GitHub!

