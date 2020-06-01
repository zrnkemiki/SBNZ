export interface VisualSymptom {

    headlightNotWorking : boolean
    
    taillightNotWorking : boolean
    electricWindowNotWorking : boolean

    
    oilPuddleUnderCar: boolean
    fluidPuddle: boolean
    whiteSmoke: boolean
    blueSmoke: boolean
    blackSmoke: boolean
    batteryDashLight: boolean //not done
    oilDashLight: boolean
    coolantDashLight: boolean
    steeringWheelDashLight: boolean
    brakePadsDashLight: boolean
    dpfDashLight: boolean
    airConditionNotWorking: boolean
    engineOverHeating: boolean //not done
    unevenTyreWear: boolean //not done
    engineStartProblem: boolean
    engineShaking: boolean //not done
    carUnstable: boolean //not done
    brakeFluidLow: boolean 
    
    carState: string;
    car: string; //Trebao bi ovo da bude ID

}