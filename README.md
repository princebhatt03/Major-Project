# 🚗 IoT-Based Obstacle Detecting Vehicle (Tesla Car Project)

## 📌 Overview

This project is a smart vehicle system designed to **detect and avoid obstacles automatically** or allow users to **manually control the vehicle** via a **web-based dashboard or Blynk mobile app**. Built using **Embedded C for ESP8266**, with **Node.js/Express.js** for backend and **EJS + Bootstrap** for a dynamic, responsive frontend.

---

## 📽️ Project Demonstration

> ✅ [View Project Demo Video (if available)](https://link-to-demo-video.com)  
> 🖼️ [Project Images Folder](https://drive.google.com/drive/folder-link)  
> 📄 [Project Synopsis PDF](https://drive.google.com/file-link)  
> 🎓 [Major Project PPT](https://drive.google.com/file-link)

---

## 🛠️ Technologies Used

### 👨‍💻 Software Stack:
- **Frontend**: EJS, HTML5, CSS3, Bootstrap 5, JavaScript
- **Backend**: Node.js, Express.js
- **Database**: MongoDB Atlas
- **Embedded Programming**: C for ESP8266 (Arduino IDE)
- **IoT**: Blynk IoT platform
- **Tools**: Git, GitHub, Postman, VS Code

### ⚙️ Hardware Components:
- ESP8266 WiFi Module
- Motor Driver (L293D)
- Ultrasonic Sensor (HC-SR04)
- IR Sensors (for Left/Right line tracking)
- Motors & Wheels
- Chassis Frame
- Power Supply/Battery

---

## 📋 Features

- 🚀 **Dual Operation Modes**:
  - **Autopilot Mode**: Detects obstacles and avoids collisions automatically.
  - **Manual Mode**: Controlled via Blynk app or web-based controller with direction buttons.

- 📲 **Web Dashboard** (EJS + Bootstrap):
  - Live car display with arrow buttons
  - Toggle between Autopilot and Manual mode
  - Visual obstacle placement
  - Mode switch with feedback message

- 📟 **Sensor-Based Movement**:
  - Ultrasonic for distance measurement
  - IR Sensors for side detection
  - Delay and decision logic for obstacle handling

- 💾 **User Auth System**:
  - Register/Login
  - Flash messaging for success/error
  - Session-based user login
  - MongoDB for data storage

---

## 🔄 Working Principle

### 🚗 Car Movement Logic:
- Forward/Reverse: Controlled using `digitalWrite` logic on motor pins.
- Left/Right turn: Triggered based on IR sensor detection or user input.
- Obstacle Detection: Measured using `pulseIn()` on the ultrasonic sensor.

### 🔁 Mode Control:
- A physical switch or digital pin checks if the car is in `Manual` or `Auto` mode.
- Based on this mode, the car either obeys web/Blynk controls or follows auto obstacle detection code logic.

---

## 🧩 Backend API & Routes

| Method | Route           | Description                      |
|--------|------------------|----------------------------------|
| GET    | `/`              | Home (Protected)                 |
| GET    | `/reg`           | Registration Page                |
| POST   | `/reg`           | Register new user                |
| GET    | `/login`         | Login Page                       |
| POST   | `/login`         | Authenticate user                |

---

## 🗂️ Folder Structure

```
project/
├── backend/
│ ├── config/
│ ├── controllers/
│ ├── models/
│ │ └── users.js
│ ├── routes/
│ │ └── index.js
│ ├── views/
│ │ ├── index.ejs
│ │ ├── login.ejs
│ │ └── register.ejs
│ ├── public/
│ │ └── images/
│ └── server.js
├── hardware/
│ └── esp8266_code.ino
└── README.md

```

---

## 🖼️ Screenshots

- ✅ Home Interface (Car Dashboard)
- ✅ Manual Mode Remote Control
- ✅ Auto Mode Obstacle Avoidance
- ✅ Obstacle Detected Message
- ✅ Responsive UI (Mobile & PC)
- ✅ Register & Login Pages

_ Images and Videos:

![i1](https://github.com/user-attachments/assets/1a9304a6-645e-449d-9fb3-04bc174f73cc)

![i2](https://github.com/user-attachments/assets/61467c74-73d1-423e-b24a-1a3063434e28)

https://github.com/user-attachments/assets/b58c8cd8-383a-4353-a5b1-8879db12a301

---

## 🧠 Logic Breakdown

### ✅ Autopilot Mode:
1. Reads `MODE` pin (D4) as 0
2. Uses ultrasonic and IR sensors to determine obstacles
3. Makes decisions like:
   - `distance < 30` → Stop + turn + resume
   - `IR left/right` triggered → Adjust direction

### ✅ Manual Mode:
1. Reads `MODE` pin (D4) as 1
2. Takes input from Blynk/Web controller (V0-V3)
3. Each button press → Executes movement function (`fwd()`, `rev()`...)

---

## 📝 What's Remaining?

- ✅ UI Improvements — Completed (animated car & obstacles)
- ✅ Mobile Responsiveness — Done via Bootstrap
- ❌ Live Video Streaming (Optional Future Feature)
- ❌ GPS Location Tracking (Possible future upgrade)
- ❌ MongoDB logs for sensor & movement data (Optional)
- ❌ Security enhancement (Token encryption)

---

## 👨‍💼 Team Members

| Name           | Role                |
|----------------|---------------------|
| Akshat Jain    | Connections Setup   |
| Honey Patel    | Connections Setup   |
| Prince Bhatt   | Full Stack Lead     |
| Vanshika Nema  | Developer Tester    |

---

## 📑 Certificates, Docs, and Reports

- 📄 [Project Certificate (Guide)]([https://drive.google.com/file-link](https://drive.google.com/file/d/1BFSImOSSbLfNypgUWGq1Y_1cj1KVALXw/view?usp=drive_link))
- 📘 [Final Report PDF]([https://drive.google.com/file-link](https://drive.google.com/file/d/1BFSImOSSbLfNypgUWGq1Y_1cj1KVALXw/view?usp=drive_link))
- 🗂️ [Word Files (Table of Contents, Acknowledgement, Feedback, etc.)]([https://drive.google.com/folder-link](https://drive.google.com/file/d/1Bd4zFai2p6-jqYzGJ3V-d44A0lwgdj6H/view?usp=drive_link))

---

## 🧠 Conclusion

This project combines **IoT, Embedded Systems, and Web Technologies** to provide a functional **Smart Obstacle-Avoiding Vehicle**. The dual operation feature and the seamless integration of software + hardware showcase the real-world applicability of this solution.

---

## 📧 Contact

- **Prince Bhatt**
  - 📧 princebhatt316@gmail.com
  - 🔗 [GitHub](https://github.com/princebhatt03)
  - 🔗 [Portfolio](https://princebhatt03.github.io/Portfolio)
  - 🔗 [LinkedIn](https://linkedin.com/in/prince-bhatt-0958a725a)

---

