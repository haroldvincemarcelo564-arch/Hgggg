# 📥 Nebula Client - Complete Download & Installation Guide

## ⚡ Quick Start (2 Minutes)

### Step 1: Download the Mod JAR
```
👉 https://github.com/haroldvincemarcelo564-arch/Hgggg/releases
```

**OR** Build it yourself:
```bash
git clone https://github.com/haroldvincemarcelo564-arch/Hgggg.git
cd Hgggg
git checkout nebula-client-main
./gradlew build
```

Compiled JAR location: `build/libs/nebula-client-1.0.0.jar`

---

## 🎮 Installation by Operating System

### Windows 10/11

**Method 1: Copy to Mods Folder (Easiest)**

1. Download: `nebula-client-1.0.0.jar`
2. Press `Win + R` and type:
   ```
   %APPDATA%\.minecraft\mods
   ```
3. Paste the JAR file here
4. Launch Minecraft with Fabric profile

**Method 2: Manual Path**
1. Open File Explorer
2. Navigate to: `C:\Users\[YourUsername]\AppData\Roaming\.minecraft\mods`
3. Create `mods` folder if it doesn't exist
4. Paste JAR file

**Method 3: Using Launcher** (MultiMC/PolyMC)
1. Open MultiMC/PolyMC
2. Right-click your Fabric instance → Edit Instance
3. Go to "Mods" tab
4. Click "Add Mod" → Select JAR file
5. Click "OK"

---

### Linux

**Method 1: Command Line (Recommended)**
```bash
# Download
wget https://github.com/haroldvincemarcelo564-arch/Hgggg/releases/download/v1.0.0/nebula-client-1.0.0.jar

# Move to mods folder
mkdir -p ~/.minecraft/mods
mv nebula-client-1.0.0.jar ~/.minecraft/mods/
```

**Method 2: Manual**
1. Download JAR file
2. Open terminal
3. Run:
   ```bash
   cp ~/Downloads/nebula-client-1.0.0.jar ~/.minecraft/mods/
   ```

**Method 3: GUI**
1. Open file manager
2. Press `Ctrl + H` to show hidden files
3. Navigate to: `.minecraft/mods/`
4. Create if doesn't exist: `mkdir -p ~/.minecraft/mods`
5. Copy JAR file there

---

### macOS

**Method 1: Finder (Easiest)**
1. Download JAR file
2. Open Finder
3. Press `Cmd + Shift + G` (Go to folder)
4. Paste:
   ```
   ~/Library/Application Support/minecraft/mods
   ```
5. Create folder if needed
6. Drag JAR file into folder

**Method 2: Terminal**
```bash
# Download
curl -L https://github.com/haroldvincemarcelo564-arch/Hgggg/releases/download/v1.0.0/nebula-client-1.0.0.jar -o nebula-client-1.0.0.jar

# Move to mods
mkdir -p ~/Library/Application\ Support/minecraft/mods
mv nebula-client-1.0.0.jar ~/Library/Application\ Support/minecraft/mods/
```

---

## 🚀 Launch Minecraft

### Using Official Launcher

1. Open Minecraft Launcher
2. Click "Installations"
3. Find or create a Fabric installation for **1.21.1**
4. Click "Play"
5. Wait for mods to load (first launch takes 30-60 seconds)
6. Enjoy Nebula Client! ✨

### Using MultiMC/PolyMC

1. Select your Fabric 1.21.1 instance
2. Click "Play"
3. Mods load automatically

---

## 📦 Build from Source

### Requirements
- **Java 21+** ([Download](https://www.oracle.com/java/technologies/downloads/#java21))
- **Git** ([Download](https://git-scm.com/download))
- **Gradle** (Included in repo)

### Build Steps

**Windows:**
```batch
git clone https://github.com/haroldvincemarcelo564-arch/Hgggg.git
cd Hgggg
git checkout nebula-client-main
.\gradlew build
```

**Linux/macOS:**
```bash
git clone https://github.com/haroldvincemarcelo564-arch/Hgggg.git
cd Hgggg
git checkout nebula-client-main
chmod +x gradlew
./gradlew build
```

**Output JAR:**
```
build/libs/nebula-client-1.0.0.jar
```

---

## ⭐ Recommended Optimization Mods (Like OptiFine)

Nebula Client works best with these optimization mods:

### Essential Optimization Mods

| Mod | Download | Benefits | Performance |
|-----|----------|----------|-------------|
| **Sodium** | [Modrinth](https://modrinth.com/mod/sodium) | Modern rendering engine | +20-100% FPS |
| **Lithium** | [Modrinth](https://modrinth.com/mod/lithium) | General optimization | -CPU usage |
| **Phosphor** | [Modrinth](https://modrinth.com/mod/phosphor) | Lighting engine | +50% faster |
| **Starlight** | [Modrinth](https://modrinth.com/mod/starlight) | Advanced lighting | 10x faster |
| **Entity Culling** | [Modrinth](https://modrinth.com/mod/entity-culling) | Skip off-screen entities | +15-20% FPS |

### Advanced Optimization Mods

| Mod | Download | Benefits | Performance |
|-----|----------|----------|-------------|
| **Iris Shaders** | [Modrinth](https://modrinth.com/mod/iris) | Shader support | Best graphics |
| **C2ME** | [Modrinth](https://modrinth.com/mod/c2me-fabric) | Multi-threaded chunks | +30% FPS |
| **Ferrite Core** | [Modrinth](https://modrinth.com/mod/ferrite-core) | Memory optimization | -10-30% RAM |
| **Ksyxis** | [Modrinth](https://modrinth.com/mod/ksyxis) | World gen optimization | Faster chunks |
| **Lazy DFU** | [Modrinth](https://modrinth.com/mod/lazydfu) | Faster startup | -50% load time |

### High-End Gaming Mods

| Mod | Download | Benefits | GPU |
|-----|----------|----------|-----|
| **Nvidium** | [Modrinth](https://modrinth.com/mod/nvidium) | NVIDIA optimization | RTX cards |
| **Canvas** | [Modrinth](https://modrinth.com/mod/canvas) | Advanced rendering | RTX support |

---

## 🎯 Installation Guide for Optimization Mods

### One-Click Method (Using Nebula Client)

1. Launch Minecraft with Nebula Client
2. Open in-game: Press `O` (configurable)
3. Go to "Mods" → "Optimization"
4. Click "Install Recommended"
5. Wait for download
6. Restart Minecraft

### Manual Installation

**Step 1: Download Mods**
- Visit each Modrinth link above
- Click "Download" button
- Save to Downloads folder

**Step 2: Move to Mods Folder**

**Windows:**
```
%APPDATA%\.minecraft\mods
```

**Linux:**
```
~/.minecraft/mods/
```

**macOS:**
```
~/Library/Application Support/minecraft/mods/
```

**Step 3: Restart Minecraft**
- Close Minecraft
- Reopen with Fabric profile
- Mods load automatically

---

## ✅ Verification Checklist

After installation, verify everything works:

- [ ] Minecraft launches without crashes
- [ ] Nebula Client loads (check console for messages)
- [ ] Main menu appears with custom theme
- [ ] HUD elements are visible (FPS, Ping, etc.)
- [ ] No purple/magenta error textures
- [ ] Performance is stable

### If Something Goes Wrong

**Issue: Minecraft won't start**
- ✓ Java 21+ installed? Check: `java -version`
- ✓ JAR in correct mods folder?
- ✓ Fabric loader 0.15.0+? (Check launcher)

**Issue: Nebula Client doesn't load**
- ✓ Check Minecraft console for errors
- ✓ Delete `.minecraft/cache` folder
- ✓ Reinstall Fabric loader

**Issue: Low FPS**
- ✓ Install optimization mods (Sodium, Lithium)
- ✓ Lower render distance
- ✓ Disable fancy graphics

---

## 🌐 Download Links

### Official Repository
```
https://github.com/haroldvincemarcelo564-arch/Hgggg
```

### Releases Page
```
https://github.com/haroldvincemarcelo564-arch/Hgggg/releases
```

### Main Branch
```
https://github.com/haroldvincemarcelo564-arch/Hgggg/tree/nebula-client-main
```

### Direct JAR Download
```
https://github.com/haroldvincemarcelo564-arch/Hgggg/releases/download/v1.0.0/nebula-client-1.0.0.jar
```

---

## 📋 System Requirements

### Minimum
- **Java**: 21 or higher
- **Minecraft**: 1.21.1
- **Fabric Loader**: 0.15.0+
- **RAM**: 4GB minimum
- **GPU**: Integrated graphics supported

### Recommended
- **Java**: 21 LTS
- **RAM**: 8GB+
- **GPU**: Dedicated GPU (NVIDIA/AMD)
- **CPU**: Modern multi-core processor
- **Storage**: 2GB free space

### For RTX/Ray Tracing
- **GPU**: NVIDIA RTX series
- **Java**: 21+
- **RAM**: 16GB+
- **Drivers**: Latest NVIDIA drivers

---

## 🎮 First Launch Guide

### What to Expect

1. **First Load** (60-120 seconds)
   - Minecraft compiles shaders and resources
   - This is normal, happens only once

2. **Main Menu**
   - Beautiful animated Nebula background
   - Modern button interface
   - Theme selector in top-right

3. **In-Game**
   - HUD appears in corners
   - FPS/CPS/Ping displays
   - Press `O` to open settings (configurable)

### Initial Configuration

1. Open HUD Editor (Default: `K` key)
2. Drag HUD elements to desired positions
3. Go to Settings → Appearance
4. Select theme (Dark Nebula, Aurora, Galaxy)
5. Customize accent color
6. Install optimization mods for better FPS

---

## 📊 Performance Comparison

### Without Optimization Mods
- **FPS**: 40-60 (depending on PC)
- **RAM Usage**: 2-4GB
- **Load Time**: 2-3 minutes

### With Optimization Mods (Sodium + Lithium + Others)
- **FPS**: 100-200+ (depending on PC)
- **RAM Usage**: 1-2GB
- **Load Time**: 30-60 seconds
- **Performance Boost**: +150-300%

---

## 🚀 What's Next?

After installation, explore:

✨ **Cosmetics** - Capes, Wings, Trails
🎨 **Themes** - 3 Professional themes
⚙️ **Settings** - 50+ customizable options
🎯 **PvP Features** - Zoom, Freelook, Crosshair Editor
📊 **Performance** - Real-time monitoring
🎮 **Mods** - One-click mod installer

---

## 📞 Support & Contact

- **GitHub**: https://github.com/haroldvincemarcelo564-arch/Hgggg
- **Issues**: Report bugs and request features
- **Discussions**: Ask questions and share feedback

---

**Happy Gaming with Nebula Client! 🌟**

*Where Performance Meets Beauty*
