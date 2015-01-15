package com.dk.data

import org.jongo.marshall.jackson.oid.ObjectId

class Summary {

    @ObjectId
    private String _id;
    private String userId = "Unknown"
    private Map<ExerciseType, List<ExerciseLogEntry>> exercisesLog
    private String authToken
    private String email
    private String name
    //db.summaries.update({userId:"115205054463402182666"}, {$set:{trusted:"someUberToken"}} )
    private String trusted

    public String getAuthToken() {
        return authToken;
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<ExerciseType, List<ExerciseLogEntry>> getExercisesLog() {
        return exercisesLog;
    }

    public void setExercisesLog(Map<ExerciseType, List<ExerciseLogEntry>> exercisesLog) {
        this.exercisesLog = exercisesLog;
    }

    def Summary(){
        exercisesLog = [:]
        authToken = UUID.randomUUID().toString()
        ExerciseType.values().each{ type ->
            exercisesLog[type]=[]
        }
    }

    def addLogEntry(ExerciseType et, ExerciseLogEntry ele){
        if(exercisesLog[et]==null){
            exercisesLog[et]=[ele]
        } else {
            if(!exercisesLog[et].contains(ele)){
                exercisesLog[et].add(ele)
                (exercisesLog[et]).sort()
            }
        }
    }

    def removeLogEntry(ExerciseType et, ExerciseLogEntry ele){
        if(exercisesLog[et]==null){
            return
        } else {
            exercisesLog[et] = exercisesLog[et].minus(ele)
        }
    }

    def String toString(){
        return "${_id}: ${userId} ${exercisesLog}".toString()
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrusted() {
        return trusted;
    }

    public void setTrusted(String trusted) {
        this.trusted = trusted;
    }
}
