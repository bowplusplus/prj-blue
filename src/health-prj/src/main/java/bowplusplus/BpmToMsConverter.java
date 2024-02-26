package bowplusplus;

class BpmToMsConverter {
    int bpm;
    BpmToMsConverter(int bpm) {
        this.bpm = bpm;
    }
    int getMsFromBpm() {
        int milliSeconds = 60 / this.bpm * 1000;
        return milliSeconds;
    }
}
