int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int final=arrivalTime+delayedTime;
    if (final>=24){
        final=final-24;
    }
    return final;
}