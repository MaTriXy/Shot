#!/usr/bin/env bash
# fail if any commands fails
set -e

echo "Starting screenshot tests emulator 📸📱!"

$ANDROID_HOME/emulator/emulator -avd "shot-emulator" -skin 1080x1920 -no-audio -no-boot-anim &

echo "Emulator ready. Happy testing 😃"
