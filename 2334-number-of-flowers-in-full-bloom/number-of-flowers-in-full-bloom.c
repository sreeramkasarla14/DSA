#include <stdlib.h>


int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}


int countStarted(int* arr, int size, int target) {
    int low = 0, high = size - 1;
    int ans = 0;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] <= target) {
            ans = mid + 1; 
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return ans;
}


int countEnded(int* arr, int size, int target) {
    int low = 0, high = size - 1;
    int ans = 0;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] < target) {
            ans = mid + 1; 
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return ans;
}

int* fullBloomFlowers(int** flowers, int flowersSize, int* flowersColSize, int* people, int peopleSize, int* returnSize) {
    
    int* starts = (int*)malloc(flowersSize * sizeof(int));
    int* ends = (int*)malloc(flowersSize * sizeof(int));
    
    for (int i = 0; i < flowersSize; i++) {
        starts[i] = flowers[i][0];
        ends[i] = flowers[i][1];
    }
    
    
    qsort(starts, flowersSize, sizeof(int), compare);
    qsort(ends, flowersSize, sizeof(int), compare);
    
    
    int* answer = (int*)malloc(peopleSize * sizeof(int));
    *returnSize = peopleSize;
    
    
    for (int i = 0; i < peopleSize; i++) {
        int t = people[i];
        int started = countStarted(starts, flowersSize, t);
        int ended = countEnded(ends, flowersSize, t);
        answer[i] = started - ended;
    }
    
    
    free(starts);
    free(ends);
    
    return answer;
}
