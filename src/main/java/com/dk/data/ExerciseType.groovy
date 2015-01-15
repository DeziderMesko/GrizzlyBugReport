package com.dk.data

import com.fasterxml.jackson.annotation.JsonFormat



@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum ExerciseType {

    pushup(["chapter":5],[
        initMap(1, "Wall pushups",46 , [10], [25, 25], [50, 50, 50]),
        initMap(2, "Incline pushups",48 , [10], [20, 20], [40, 40, 40]),
        initMap(3, "Kneeling pushups",50 , [10], [15, 15], [30, 30, 30]),
        initMap(4, "Half pushups",52 , [8], [12, 12], [25, 25]),
        initMap(5, "Full pushups",54 , [5], [10, 10], [20, 20]),
        initMap(6, "Close pushups",56 , [5], [10, 10], [20, 20]),
        initMap(7, "Uneven pushups",58 , [5], [10, 10], [20, 20]),
        initMap(8, "1/2 one-arm pushups",60 , [5], [10, 10], [20, 20]),
        initMap(9, "Lever pushups",62 , [5], [10, 10], [20, 20]),
        initMap(10, "One-arm pushups",64 , [5], [10, 10], [100])
    ]),
    squat(["chapter":6],[
        initMap(1, "Shoulderstand squats",84,[10], [25, 25], [50, 50, 50]),
        initMap(2, "Jackknife squats",86,[10], [20, 20], [40, 40, 40]),
        initMap(3, "Supported squats",88,[10], [15, 15], [30, 30, 30]),
        initMap(4, "Half squats",90,[8], [35, 35], [50, 50]),
        initMap(5, "Full squats",92,[5], [10, 10], [30, 30]),
        initMap(6, "Close squats",94,[5], [10, 10], [20, 20]),
        initMap(7, "Uneven squats",96,[5], [10, 10], [20, 20]),
        initMap(8, "1/2 one-leg squats",98,[5], [10, 10], [20, 20]),
        initMap(9, "Assisted one-leg squats",100,[5], [10, 10], [20, 20]),
        initMap(10, "One-leg squats",102,[5], [10, 10], [50, 50])
    ]),
    pullup(["chapter":7],[
        initMap(1, "Vertical pulls", 122, [10], [20, 20], [40, 40, 40]),
        initMap(2, "Horizontal pulls", 124, [10], [20, 20], [30, 30, 30]),
        initMap(3, "Jackknife pulls", 126, [10], [15, 15], [20, 20, 20]),
        initMap(4, "Half pullups", 128, [8], [11, 11], [15, 15]),
        initMap(5, "Full pullups", 130, [5], [8, 8], [10, 10]),
        initMap(6, "Close pullups", 132, [5], [8, 8], [10, 10]),
        initMap(7, "Uneven pullups", 134, [5], [7, 7], [9, 9]),
        initMap(8, "1/2 one-arm pullups", 136, [4], [6, 6], [8, 8]),
        initMap(9, "Assisted one-arm pullups", 138, [3], [5, 5], [7, 7]),
        initMap(10, "One-arm pullups", 140, [1], [3, 3], [6, 6])
    ]),
    legraise(["chapter":8],[
        initMap(1, "Knee tucks",156 , [10], [25, 25], [40, 40, 40]),
        initMap(2, "Flat knee raises",158 , [10], [20, 20], [35, 35, 35]),
        initMap(3, "Flat bent leg raises",160 , [10], [15, 15], [30, 30, 30]),
        initMap(4, "Flat frog raises",162 , [8], [15, 15], [25, 25, 25]),
        initMap(5, "Flat straight leg raises",164 , [5], [10, 10], [20, 20]),
        initMap(6, "Hanging knee raises",166 , [5], [10, 10], [15, 15]),
        initMap(7, "Hanging bent leg raises",168 , [5], [10, 10], [15, 15]),
        initMap(8, "Hanging frog raises",170 , [5], [10, 10], [15, 15]),
        initMap(9, "Partial straight leg raises",172 , [5], [10, 10], [15, 15]),
        initMap(10, "Hanging straight leg raises",174 , [5], [10, 10], [15, 15]),
    ]),
    bridge(["chapter":9],[
        initMap(1, "Short bridges",194 , [10], [25, 25], [50, 50, 50]),
        initMap(2, "Straight bridges",196 , [10], [20, 20], [40, 40, 40]),
        initMap(3, "Angled bridges",198 , [8], [15, 15], [30, 30, 30]),
        initMap(4, "Head bridges",200 , [8], [15, 15], [25, 25]),
        initMap(5, "Half bridges",202 , [8], [15, 15], [20, 20]),
        initMap(6, "Full bridges",204 , [6], [10, 10], [15, 15]),
        initMap(7, "Wall walking bridges (down)",206 , [3], [6, 6], [10, 10]),
        initMap(8, "Wall walking bridges (up)",208 , [2], [4, 4], [8, 8]),
        initMap(9, "Closing bridges",210 , [1], [3, 3], [6, 6]),
        initMap(10, "Stand-to-stand bridges",212 , [1], [3, 3], [20, 20]),
    ]),
    handstand(["chapter":10],[
        initMap(1, "Wall headstands",230 , [30], [60], [120], "second"),
        initMap(2, "Crow stands",232 , [10], [30], [60], "second"),
        initMap(3, "Wall handstands",234 , [30], [60], [120], "second"),
        initMap(4, "Half handstand pushups",236 , [5], [10, 10], [20, 20]),
        initMap(5, "Handstand pushups",238 , [5], [10, 10], [15, 15]),
        initMap(6, "Close handstand pushups",240 , [5], [9, 9], [12, 12]),
        initMap(7, "Uneven handstand pushups",242 , [5], [8, 8], [10, 10]),
        initMap(8, "1/2 one-arm handstand pushups",244 , [4], [6, 6], [8, 8]),
        initMap(9, "Lever handstand pushups",246 , [3], [4, 4], [6, 6]),
        initMap(10, "One-arm handstand pushups",248 , [1], [2, 2], [5]),
    ])

    def static initMap(level, name, page, beginner, intermediate, progression, unit="repetition"){
        return ["lvl":level, "lvlName":name, "lvlPage":page, "lvlUnit":unit, "lvlProgression":["beginner":beginner, "intermediate":intermediate, "progression":progression]]
    }

    def levels;
    def metadata;
    ExerciseType(Map metadata, ArrayList levels){
        this.levels = levels
        this.metadata = metadata
    }

    ExerciseType(ArrayList levels){
        this([:], levels)
    }

    def static getEnum(String value){
        if(value==null) return null
        if(value.toLowerCase().startsWith("handstand")){
            return ExerciseType.handstand
        } else {
            return ExerciseType.valueOf(value);
        }
    }

    ExerciseType(){
        this.levels = []
    }
}
