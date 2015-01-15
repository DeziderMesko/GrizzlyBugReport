package com.dk.data

import groovy.transform.EqualsAndHashCode


@EqualsAndHashCode(excludes = ["comment"])
class ExerciseLogEntry implements Comparable {
    Date date
    Integer level
    List<Integer> reps = []

    String comment

    def String toString(){
        return "${date} ${reps}@${level}"
    }

    @Override
    public int compareTo(Object o) {
        def ele = (ExerciseLogEntry) o
        if(ele.date.before(this.date)){
            return -1
        }
        if(this.date.before(ele.date)){
            return 1
        }
        //at this point dates are same
        if(ele.level < this.level){
            return -1
        }
        if(this.level < ele.level){
            return 1
        }
        //at this point levels are same
        if(ele.reps.sum(0)<this.reps.sum(0)){
            return -1
        }
        if(this.reps.sum(0)<ele.reps.sum(0)){
            return 1
        }
        return 0
    }
}
