package com.company;

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
            }

            d.playTopHat();
        d.playSnare();
        }
    }
