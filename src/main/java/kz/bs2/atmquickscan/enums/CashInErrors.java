package kz.bs2.atmquickscan.enums;

public enum CashInErrors {
    ERROR_010000("""
            ERROR:
            Operating system error, hardware error.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – If necessary re-load the firmware.
            – If the error reoccurs, replace the controller.
            """),
    ERROR_020020("""
            ERROR:
            Operating system error, internal firmware error.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – If the error persists, re-load the firmware.
            – If the error reoccurs replace the amplifier / controller board.
            """),
    ERROR_050001("""
            ERROR:
            No connection to dispenser module.
                        
            EXPLANATION/ACTION:
            Permanent status display: Dispenser module 01750047708 is installed which may cause disturbances in the dispensing area. Replacement with an up-to-date dispenser module is recommended.
                        
            Blinking status display:
            – Check the cable connection between the dispenser module and the back panel.
            – Restart the CCDM.
            – Replace the dispenser module.
            – If the error reoccurs, replace the chassis of the CCDM.
            """),
    ERROR_060002("""
            ERROR:
            No connection to amplifier board.
                        
            EXPLANATION/ACTION:
            – Check the plug connections between amplifier and controller board.
            – If necessary re-load the firmware.
            – Restart the CCDM.
            – If the error reoccurs replace the amplifier / controller board.
            """),
    ERROR_070003("""
            ERROR:
            No connection to stacker board.
                        
            EXPLANATION/ACTION:
            – Check the plug connection between amplifier board and controller board.
            – Check the configuration of the controller.
            – Re-load the firmware of the CCDM.
            – Restart the CCDM.
            – If the error reoccurs, replace the distributor transport.
            """),
    ERROR_080021("""
            ERROR:
            Battery on controller board empty.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Delete the cassette counters and the CEX.
            – Perform a reset.
            – Restart the system.
            – If the error reoccurs replace the amplifier / controller board.
            """),
    ERROR_090024("""
            ERROR:
            Device configuration of controller incorrect or missing.
                        
            EXPLANATION/ACTION:
            – Restart the system.
            – Load the appropriate configuration using the product-specific test software.
            – If the error reoccurs, reload the firmware.
            – If the error cannot be eliminated by means of the above steps, replace the amplifier / controller board.
            """),
    ERROR_100000("""
            ERROR:
            Error on controller.
                        
            EXPLANATION/ACTION:
            – Restart the system.
            – If necessary re-load the firmware.
            – If the error cannot be eliminated, replace the amplifier / controller board.
            """),
    ERROR_110000("""
            ERROR:
            No firmware.
                        
            EXPLANATION/ACTION:
            – Restart the system.
            – If the error persists, re-load the firmware.
            """),
    ERROR_120022("""
            ERROR:
            Safety switch is active.
                        
            EXPLANATION/ACTION:
            – Check whether the CCDM (head module and cassette module) is pushed into the device correctly (locking mechanism!) and whether the safety switch is correctly bridged.
            – Check the connection cable between the safety switch and the back panel.
            – Restart the CCDM.
            – If the error reoccurs, replace the safety switch.
                        
            After the LINE XSA module has been reconfigured, there is a waiting period of up to 270 seconds until the CCDM is ready for operation.
            """),
    ERROR_130000("""
            ERROR:
            Retract documents are stored in the input/output area.
                        
            EXPLANATION/ACTION:
            Remove the documents from the input/output area.
            """),
    ERROR_140000("""
            ERROR:
            Minimum configuration is missing (at least 1 cash-in cassette + retract cassette)
                        
            EXPLANATION/ACTION:
            Register the cassettes using the product-specific software (e.g. Service Operator Panel).
            """),
    ERROR_150000("""
            ERROR:
            Operating system is loading new files on the CCDM controller.
                        
            EXPLANATION/ACTION:
            Wait for the system to finish loading the firmware.
            """),
    ERROR_170023("""
            ERROR:
            Data transfer on RS232 interface.
                        
            EXPLANATION/ACTION:
            Wait for the data transfer to finish.
            """),
    ERROR_180025("""
            ERROR:
            The application overloads the CCDM hardware (too many reset commands per time unit).
                        
            EXPLANATION/ACTION:
            – Power down the PC / the application.
            – Leave the CCDM switched on for five minutes.
            – Power up the PC / the application.
            – Perform a reset.
            – Inform the person who is responsible for software.
            """),
    ERROR_190000("""
            ERROR:
            Shutter blocked.
                        
            EXPLANATION/ACTION:
            – Remove any foreign matter from the shutter area.
            – Make sure the plug of the shutter is plugged in at the controller.
            – Perform a reset.
            – If the error reoccurs, replace the shutter.
            """),
    ERROR_190144("""
            ERROR:
            Shutter blocked.
                        
            EXPLANATION/ACTION:
            – Remove any foreign matter from the shutter area.
            – Make sure the plug of the shutter is plugged in at the controller.
            – Perform a reset.
            – If the error reoccurs, replace the shutter.
                        
            EC:
            – Mechanical blocking / foreign matter.
            – Plug has not been plugged in.
            – Shutter is defective.
            """),
    ERROR_200000("""
            ERROR:
            Error of the metal detection unit.
                        
            EXPLANATION/ACTION:
            – Check the plug connection on the metal detection unit.
            – Check the plug connection on the dispenser's board.
            – Restart the CCDM.
            – If the error reoccurs, replace the metal detection.
            – If the error reoccurs, replace the dispenser module.
            """),
    ERROR_200145("""
            ERROR:
            Error of the metal detection unit.
                        
            EXPLANATION/ACTION:
            – Check the plug connection on the metal detection unit.
            – Check the plug connection on the dispenser's board.
            – Restart the CCDM.
            – If the error reoccurs, replace the metal detection.
            – If the error reoccurs, replace the dispenser module.
                        
            EC:
            Module is defective or plug has not been plugged in.
            """),
    ERROR_210000("""
            ERROR:
            Error on swivel transport unit or in the area of the bundle alignment.
                        
            EXPLANATION/ACTION:
            Swivel transport unit:
            – Check the home position of swivel transport units 1 and 2.
            – Inspect photosensors VLS3 and VLS4.
            – Inspect motors VSM5 and VSM6.
            – Replace the dispenser module, if necessary.
                        
            Bundle alignment:
            – Check whether the bundle alignment is clear.
            – Inspect photosensors VLS8 and motor VSM7.
            – Replace the dispenser module, if necessary.
            """),
    ERROR_210120("""
            ERROR:
            Error on swivel transport unit or in the area of the bundle alignment.
                        
            EXPLANATION/ACTION:
            Swivel transport unit:
            – Check the home position of swivel transport units 1 and 2.
            – Inspect photosensors VLS3 and VLS4.
            – Inspect motors VSM5 and VSM6.
            – Replace the dispenser module, if necessary.
                        
            Bundle alignment:
            – Check whether the bundle alignment is clear.
            – Inspect photosensors VLS8 and motor VSM7.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Swivel transport 1 / 2 is mechanically blocked.
            – Home position photosensor is defective or soiled (VLS3 / VLS4).
            – Transport error: motor does not run properly (VSM5 / VSM6).
            """),
    ERROR_210121("""
            ERROR:
            Error on swivel transport unit or in the area of the bundle alignment.
                        
            EXPLANATION/ACTION:
            Swivel transport unit:
            – Check the home position of swivel transport units 1 and 2.
            – Inspect photosensors VLS3 and VLS4.
            – Inspect motors VSM5 and VSM6.
            – Replace the dispenser module, if necessary.
                        
            Bundle alignment:
            – Check whether the bundle alignment is clear.
            – Inspect photosensors VLS8 and motor VSM7.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Swivel transport is mechanically blocked.
            – Home position photosensor is defective or soiled (VLS3).
            – Transport error: motor does not run properly (VSM5).
                        
            Or diagnostic test triggered by operator: swivel transport 1 in dispenser module defective.
            """),
    ERROR_210122("""
            ERROR:
            Error on swivel transport unit or in the area of the bundle alignment.
                        
            EXPLANATION/ACTION:
            Swivel transport unit:
            – Check the home position of swivel transport units 1 and 2.
            – Inspect photosensors VLS3 and VLS4.
            – Inspect motors VSM5 and VSM6.
            – Replace the dispenser module, if necessary.
                        
            Bundle alignment:
            – Check whether the bundle alignment is clear.
            – Inspect photosensors VLS8 and motor VSM7.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Swivel transport is mechanically blocked.
            – Home position photosensor is defective or soiled (VLS4).
            – Transport error: motor does not run properly (VSM6).
                        
            Or diagnostic test triggered by operator: swivel transport 2 in dispenser module defective.
            """),
    ERROR_210130("""
            ERROR:
            Error on swivel transport unit or in the area of the bundle alignment.
                        
            EXPLANATION/ACTION:
            Swivel transport unit:
            – Check the home position of swivel transport units 1 and 2.
            – Inspect photosensors VLS3 and VLS4.
            – Inspect motors VSM5 and VSM6.
            – Replace the dispenser module, if necessary.
                        
            Bundle alignment:
            – Check whether the bundle alignment is clear.
            – Inspect photosensors VLS8 and motor VSM7.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Drive is mechanically blocked.
            – Home position photosensor is defective or soiled (VLS8).
            – Transport error: motor does not run properly (VSM7).
                        
            Or diagnostic test triggered by operator: bundle width setting in dispenser module defective.
            """),
    ERROR_220000("""
            ERROR:
            Media jam in dispenser module (feed error detected prior to dispensing).
                        
            EXPLANATION/ACTION:
            – Remove any jammed media from the dispenser module's paper path.
            – Perform a reset.
            – Check the cam disk position.
            – Check the dispenser module's motors.
            – Restart the CCDM.
            – Replace the dispenser module, if necessary.
            """),
    ERROR_220100("""
            ERROR:
            Media jam in dispenser module (feed error detected prior to dispensing).
                        
            EXPLANATION/ACTION:
            – Remove any jammed media from the dispenser module's paper path.
            – Perform a reset.
            – Check the cam disk position.
            – Check the dispenser module's motors.
            – Restart the CCDM.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Paper jam in I/O transport area.
            – Photosensor VLS2 or VLS5 is defective or soiled.
            – Semi-rotary actuator motor does not run properly (VSM1).
            – Swivel transport is not lowered due to blocking etc. (VSM6 / VLS4).
            – Stacker table is not on top due to blocking or defect (VSM8 / VLS9).
                        
            Or diagnostic test triggered by operator: dispenser module defective.
            """),
    ERROR_220108("""
            ERROR:
            Media jam in dispenser module (feed error detected prior to dispensing).
                        
            EXPLANATION/ACTION:
            – Remove any jammed media from the dispenser module's paper path.
            – Perform a reset.
            – Check the cam disk position.
            – Check the dispenser module's motors.
            – Restart the CCDM.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – A paper jam has occurred in the dispensing / I/O area.
            – Photosensor VLS2 is defective or soiled.
            – Motors VSM1/2/3 do not run properly.
            """),
    ERROR_220112("""
            ERROR:
            Media jam in dispenser module (feed error detected prior to dispensing).
                        
            EXPLANATION/ACTION:
            – Remove any jammed media from the dispenser module's paper path.
            – Perform a reset.
            – Check the cam disk position.
            – Check the dispenser module's motors.
            – Restart the CCDM.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Paper jam in I/O area -> paper feed rollers.
            – Photosensor VLS2 is defective or soiled.
            – Photosensor VLS6 is defective or soiled.
            – Transport error: motors VSM1/2/3 do not run properly.
            – Swivel transport is not lowered due to blocking etc. (VSM6 / VLS4).
            – Stacker table is not on top due to blocking or defect (VSM8 / VLS9).
            – Swivel transport 2 is defective (VSM1).
            – Clock wheel in swivel transport VLS5 is defective or soiled.
            – Dispensing comb is blocked.
            """),
    ERROR_220181("""
            ERROR:
            Media jam in dispenser module (feed error detected prior to dispensing).
                        
            EXPLANATION/ACTION:
            – Remove any jammed media from the dispenser module's paper path.
            – Perform a reset.
            – Check the cam disk position.
            – Check the dispenser module's motors.
            – Restart the CCDM.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – A paper jam has occurred in the paper path between stacker and I/O transport, or paper is too long.
            – Photosensor VLS2 is defective or soiled.
            – Transport errors: motors (RSM1 / VSM1 / VSM2) do not run properly.
            – Incorrect cam disk position caused by jam or defect: Transport rollers should plunge through stacker table I/O transport (VSM8 / VLS9).
            – Swivel transport 2 is not on top due to blocking etc. (VSM6 / VLS4).
            """),
    ERROR_240000("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
            """),
    ERROR_240101("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Foreign objects or dirt detected at VLS6 or VLS7 prior to dispensing process.
            """),
    ERROR_240102("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – A paper jam has occurred in the paper feed roller area, or paper is too long.
            – Photosensor VLS6 is defective or soiled.
            – Transport error: motors VSM2/3/4 do not run properly.
            """),
    ERROR_240103("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Paper jam in paper feed roller area -> intermediate transport.
            – Photosensor VLS7 is defective or soiled.
            – Transport error: motors VSM2/3/4 do not run properly.
            """),
    ERROR_240105("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – A paper jam has occurred in the intermediate transport and possibly also in the alignment station.
            – Photosensor VLS7 is defective or soiled.
            – Motors VSM2/3/4 do not run properly.
            – Motor ASM1 of alignment station does not run properly.
            """),
    ERROR_240106("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – A paper jam has occurred in the dispensing area.
            – Photosensor VLS6 is defective or soiled.
            – Motors VSM1/2/3/4 do not run properly.
            """),
    ERROR_240113("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Paper jam in dispensing area or intermediate transport.
            – Paper too long.
            – Photosensor VLS6 is defective or soiled.
            – Motors VSM2/3/4 do not run properly.
            """),
    ERROR_240201("""
            ERROR:
            Paper jam detected during separation process.
                        
            EXPLANATION/ACTION:
            – Check paper path in dispenser module.
            – Clean the photosensors in the dispensing area of the dispenser module.
            – Carry out a photosensor adjustment / initialization.
            – Reset the photosensors to the default values, if necessary.
            – Check the dispenser module's motors, if necessary.
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            Document jam in intermediate transport or at entrance to alignment station.
            """),
    ERROR_250000("""
            ERROR:
            Error of hall sensors.
                        
            EXPLANATION/ACTION:
            – Check the plug connection on the dispenser's board (bottom of dispenser module).
            – Restart the system.
            – Replace the dispenser module, if necessary.
            """),
    ERROR_250150("""
            ERROR:
            Error of hall sensors.
                        
            EXPLANATION/ACTION:
            – Check the plug connection on the dispenser's board (bottom of dispenser module).
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Hall sensor element 1 is defective or plug is not plugged in.
            – Soiled roller, or paper remaining in roller.
            """),
    ERROR_250151("""
            ERROR:
            Error of hall sensors.
                        
            EXPLANATION/ACTION:
            – Check the plug connection on the dispenser's board (bottom of dispenser module).
            – Restart the system.
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Hall sensor element 2 is defective or plug is not plugged in.
            – Soiled roller, or paper remaining in roller.
            """),
    ERROR_260000("""
            ERROR:
            Media jam in reject transport area.
                        
            EXPLANATION/ACTION:
            – Remove any jammed media between the reject transport and the dispenser module or in the reject transport.
            – Check whether the belt of the reject transport is laying on the center of the guiding rollers.
            – Restart the CCDM.
            – Replace the dispenser module and/or the reject transport.
            """),
    ERROR_260116("""
            ERROR:
            Media jam in reject transport area.
                        
                        
            EXPLANATION/ACTION:
            – Remove any jammed media between the reject transport and the dispenser module or in the reject transport.
            – Check whether the belt of the reject transport is laying on the center of the guiding rollers.
            – Restart the CCDM.
            – Replace the dispenser module and/or the reject transport.
                        
            EC:
            – Paper jam in reject path.
            – Mechanical initialization of cam disk not correct due to blocking. See error code no. 140 for details.
            – Mechanical initialization of swivel transport 2 not correct. See error code no. 122 for details.
            – Photosensor VLS6 / VLS2 is defective or soiled.
            – Dispensing motors VSM2/3 do not run properly.
            """),
    ERROR_260180("""
            ERROR:
            Media jam in reject transport area.
                        
                        
            EXPLANATION/ACTION:
            – Remove any jammed media between the reject transport and the dispenser module or in the reject transport.
            – Check whether the belt of the reject transport is laying on the center of the guiding rollers.
            – Restart the CCDM.
            – Replace the dispenser module and/or the reject transport.
                        
            EC:
            – A paper jam has occurred in the paper path between stacker and I/O transport.
            – Photosensor VLS6 is defective or soiled.
            – Transport errors: motors (RSM1 / VSM1) do not run properly.
            – Incorrect cam disk position caused by jam or defect: I/O stacker should be lowered to ensure free reject path (VSM8 / VLS9).
            – Swivel transport 2 is not on top due to blocking etc. (VSM6 / VLS4).
            """),
    ERROR_270000("""
            ERROR:
            Error of the cam disk.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Check the cam disk position (release).
            – Replace the dispenser module, if necessary.
            """),
    ERROR_270140("""
            ERROR:
            Error of the cam disk.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Check the cam disk position (release).
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Drive is mechanically blocked.
            – Home position photosensor is defective or soiled (VLS9).
            – Transport error: motor does not run properly (VSM8).
                        
            Or diagnostic test triggered by operator: cam disk in dispenser module defective.
            """),
    ERROR_270141("""
            ERROR:
            Error of the cam disk.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Check the cam disk position (release).
            – Replace the dispenser module, if necessary.
                        
            EC:
            – Drive is mechanically blocked.
            – Home position photosensor is defective or soiled (VLS9).
            – Transport error: motor does not run properly (VSM8).
            """),
    ERROR_280000("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
            """),
    ERROR_280200("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
                        
            EC:
            Document in front of ASL1 or ALS1 is defective (keeps detecting document) -> motor AMS1 possibly defective as a result of which document is not removed from position in front of ASL1.
                        
            Or diagnostic test triggered by operator: alignment station defective.
            """),
    ERROR_280202("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
                        
            EC:
            Document jam between alignment station and sensor module or in AMG1 deflector.
            """),
    ERROR_280203("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
                        
            EC:
            No document jam. However, document transport caused problems (too much slippage or too much friction). Check transport path 'Intermediate Transport Exit' – 'Alignment Station' – 'Sensor Transport Entrance'.
            """),
    ERROR_280204("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
                        
            EC:
            Document jam in the alignment drum (document remains in drum).
            """),
    ERROR_280205("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
                        
            EC:
            Document jam in front of ALS1 during transport of document in the alignment drum.
            """),
    ERROR_280206("""
            ERROR:
            Media jam in front of or in the alignment station.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the alignment station.
            – Check the photosensors and the motors in the alignment station.
            – Carry out a photosensor adjustment / initialization.
            – Perform a reset.
            – Replace the alignment station, if necessary.
                        
            EC:
            Document jam in front of ALS1 during transport of document from alignment drum -> check transport path through drum.
            """),
    ERROR_300000("""
            ERROR:
            Error on magnetic character reader.
                        
            EXPLANATION/ACTION:
            – Check the plug connection with the magnetic character reader.
            – Restart the CCDM.
            – Replace the magnetic character reader, if necessary.
            """),
    ERROR_300030("""
            ERROR:
            Error on magnetic character reader.
                        
            EXPLANATION/ACTION:
            – Check the plug connection with the magnetic character reader.
            – Restart the CCDM.
            – Replace the magnetic character reader, if necessary.
                        
            EC:
            ADDMASTER electronic is defective or not properly connected.
            """),
    ERROR_310000("""
            ERROR:
            Error on cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Restart the system.
            – If necessary, reload cheque / cash reader firmware.
            – If necessary, reload Firewire firmware (for cheque & cash configuration).
            – If the error reoccurs even after the above steps have been taken, replace the cheque / cash reader.
            """),
    ERROR_310040("""
            ERROR:
            Error on cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Restart the system.
            – If necessary, reload cheque / cash reader firmware.
            – If necessary, reload Firewire firmware (for cheque & cash configuration).
            – If the error reoccurs even after the above steps have been taken, replace the cheque / cash reader.
                        
            EC:
            Only relevant for cheque processing:
            – Check if the firewire cable is connected to the PC and the LINE XSA module.
            – Check the PC's Firewire card.
            """),
    ERROR_310050("""
            ERROR:
            Error on cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Restart the CCDM.
            – Restart the system.
            – If necessary, reload cheque / cash reader firmware.
            – If necessary, reload Firewire firmware (for cheque & cash configuration).
            – If the error reoccurs even after the above steps have been taken, replace the cheque / cash reader.
                        
            EC:
            Baumer module is defective.
            """),
    ERROR_320000("""
            ERROR:
            External light in cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Check whether light is falling on the cheque / cash reader.
            – Clean the scanner lines of the cheque / cash reader.
            – Carry out a photosensor adjustment / initialization.
            – Restart the system.
            """),
    ERROR_320045("""
            ERROR:
            External light in cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Check whether light is falling on the cheque / cash reader.
            – Clean the scanner lines of the cheque / cash reader.
            – Carry out a photosensor adjustment / initialization.
            – Restart the system.
                        
            EC:
            – External light in cheque / cash reader.
            – Banknote level detected (light level too high due to soiled roller or document remaining under the reader).
            – Transport pulse missing or outside of admissible tolerance.
            """),
    ERROR_320053("""
            ERROR:
            External light in cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Check whether light is falling on the cheque / cash reader.
            – Clean the scanner lines of the cheque / cash reader.
            – Carry out a photosensor adjustment / initialization.
            – Restart the system.
                        
            EC:
            – External light in cheque / cash reader.
            – Banknote level detected (light level too high due to soiled roller or document remaining under the reader).
            """),
    ERROR_330000("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
            """),
    ERROR_330041("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
                        
            EC:
            LINE XSA Firmware ERROR.
            """),
    ERROR_330042("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
                        
            EC:
            LINE XSA communication error -> control logic RS232 data transfer problems.
            """),
    ERROR_330043("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
                        
            EC:
            LINE XSA data error -> configuration data faulty / corrupt.
            """),
    ERROR_330044("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
                        
            EC:
            LINE XSA Note Table Configuration not OK.
            """),
    ERROR_330051("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
                        
            EC:
            LINE XSA Firmware ERROR.
            """),
    ERROR_330052("""
            ERROR:
            Communications problems with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the firmware of the cheque / cash reader.
            – Check and update the banknote table.
            – Re-load the currency data.
            – Re-load the firmware.
            – Restart the CCDM.
            – Restart the system.
            – Replace the cheque / cash reader, if necessary.
                        
            EC:
            LINE XSA syntax - context error -> control logic RS232 data transfer problems.
            """),
    ERROR_340000("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
            """),
    ERROR_340047("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
                        
            EC:
            No connection between RS232 interface and LINE XSA interface:
            – Sensor transport not mounted or not properly connected.
            – 'Back panel board' connector has interrupted communication with sensor transport during operation.
            – Module does not reply within specified time limit.
            """),
    ERROR_340048("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
                        
            EC:
            Communication errors from LINE XSA to RS232 interface: LINE XSA module not mounted or not properly connected to back panel.
            """),
    ERROR_340049("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
                        
            EC:
            LINE XSA firmware and CCDM firmware not compatible.
            """),
    ERROR_340054("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
                        
            EC:
            LINE XSA module not mounted or not properly connected to back panel. Communication with sensor transport interrupted during operation. Module does not reply within specified time limit.
            """),
    ERROR_340055("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
                        
            EC:
            LINE XSA module not mounted or not properly connected to back panel.
            """),
    ERROR_340056("""
            ERROR:
            Communication problems (RS232 interface ) with cheque / cash reader.
                        
            EXPLANATION/ACTION:
            – Re-load the cheque / cash reader's firmware, the CCDM's firmware and/or the Firewire firmware.
                        
            EC:
            LINE XSA firmware and CCDM firmware not compatible.
            """),
    ERROR_400000("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
            """),
    ERROR_400310("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            Diagnostic test triggered by operator: sensor transport defective.
            """),
    ERROR_400311("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            – Document deflecting unit in alignment station is not functioning; blocked.
            – Photosensor SLS3 is defective or soiled.
            """),
    ERROR_400312("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            The three-way deflector has returned a document to the alignment module during transport from escrow unit to cassettes or reject tray.
            """),
    ERROR_400313("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            Document jam in entrance area of sensor transport.
            """),
    ERROR_400324("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            Slippage during transport of documents from ALS1 alignment to LINE XSA sensor, or LINE XSA sensor document message issued at the wrong time, so that the document message can no longer be allocated to a specific document.
            """),
    ERROR_400333("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            Note could not be identified due to various reasons (event message from LINE XSA sensor during banknote processing).
            """),
    ERROR_400501("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            Deflector in wrong position.
            """),
    ERROR_400502("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the area of the magnetic ink character reader and up to the entry of the sensor transport. If the error occurs frequently, replace the magnetic ink character reader.
                        
            EC:
            Jam between sensor transport (paper deflecting units) and in front of RLS1.
            """),
    ERROR_410000("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the sensor transport In particular, check the area of the 3-way deflector.
            – Check functioning of deflectors in sensor transport unit.
            – Restart the CCDM.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
            """),
    ERROR_410320("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the sensor transport In particular, check the area of the 3-way deflector.
            – Check functioning of deflectors in sensor transport unit.
            – Restart the CCDM.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
                        
            EC:
            Document jam between ALS1 and SLS1.
            """),
    ERROR_410321("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the sensor transport In particular, check the area of the 3-way deflector.
            – Check functioning of deflectors in sensor transport unit.
            – Restart the CCDM.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
                        
            EC:
            Malfunction of three-way deflector (during transport from alignment station).
            """),
    ERROR_410322("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the sensor transport In particular, check the area of the 3-way deflector.
            – Check functioning of deflectors in sensor transport unit.
            – Restart the CCDM.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
                        
            EC:
            Malfunction of three-way deflector (during transport from the escrow unit).
            """),
    ERROR_410323("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the sensor transport In particular, check the area of the 3-way deflector.
            – Check functioning of deflectors in sensor transport unit.
            – Restart the CCDM.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
                        
            EC:
            Document jam in area SLS1-> document deflecting units -> escrow unit / reject transport.
            """),
    ERROR_420000("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and deposit transport.
            – Restart the CCDM.
            – Check functioning of deflectors and motors in sensor transport unit.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
            """),
    ERROR_420301("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and deposit transport.
            – Restart the CCDM.
            – Check functioning of deflectors and motors in sensor transport unit.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
                        
            EC:
            – Document / document jam in sensor transport unit at three-way deflector.
            – SSM2 motor defective / not connected.
            – SSM2 sensor defective / not connected.
                        
            Or diagnostic test triggered by operator: 3-way deflector (SSM2) in sensor transport defective.
            """),
    ERROR_420302("""
            ERROR:
            Media jam in sensor transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and deposit transport.
            – Restart the CCDM.
            – Check functioning of deflectors and motors in sensor transport unit.
            – If the deflectors cannot be addressed correctly, replace the back panel including deposit transport and sensor transport, if necessary (logic error).
                        
            EC:
            – Document / document jam in sensor transport unit at reject deflector.
            – SSM3 motor defective / not connected.
            – SLS4 sensor defective / not connected.
                        
            Or diagnostic test triggered by operator: reject deflector (SSM3) in sensor transport defective.
            """),
    ERROR_460000("""
            ERROR:
            Document jam between sensor transport and reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and reject transport.
            – Perform a reset.
            """),
    ERROR_460332("""
            ERROR:
            Document jam between sensor transport and reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and reject transport.
            – Perform a reset.
                        
            EC:
            Document jam between sensor transport and cassettes / reject transport under RSL1 sensor.
            """),
    ERROR_460503("""
            ERROR:
            Document jam between sensor transport and reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and reject transport.
            – Perform a reset.
                        
            EC:
            Document too short (smaller than 25mm).
            """),
    ERROR_460504("""
            ERROR:
            Document jam between sensor transport and reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and reject transport.
            – Perform a reset.
                        
            EC:
            Jam between sensor transport (paper deflecting units) and behind RLS1.
            """),
    ERROR_470000("""
            ERROR:
            Initialization error of reject transport.
                        
            EXPLANATION/ACTION:
            – Check the reject transport's plug connection. To check it first remove the cheque / cash reader.
            – Check the basic position of shaft / axis and the screw in the reject transport unit.
            – Restart the CCDM.
            – Replace the reject transport, if necessary.
            """),
    ERROR_470170("""
            ERROR:
            Initialization error of reject transport.
                        
            EXPLANATION/ACTION:
            – Check the reject transport's plug connection. To check it first remove the cheque / cash reader.
            – Check the basic position of shaft / axis and the screw in the reject transport unit.
            – Restart the CCDM.
            – Replace the reject transport, if necessary.
                        
            EC:
            – Drive is mechanically blocked.
            – Home position photosensor is defective or soiled (RLS3).
            – Transport error: motor does not run properly (RSM2).
                        
            Or diagnostic test triggered by operator: reject transport defective.
            """),
    ERROR_480000("""
            ERROR:
            Document jam between sensor transport and storage / reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and storage or reject transport.
            – Restart the CCDM.
            """),
    ERROR_480331("""
            ERROR:
            Document jam between sensor transport and storage / reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and storage or reject transport.
            – Restart the CCDM.
                        
            EC:
            Document jam between sensor transport and cassettes / reject transport under RSL1 sensor.
            """),
    ERROR_480601("""
            ERROR:
            Document jam between sensor transport and storage / reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and storage or reject transport.
            – Restart the CCDM.
                        
            EC:
            Banknote does not quit RLS1 photosensor using specified path and tolerance.RLS1.
            """),
    ERROR_480602("""
            ERROR:
            Document jam between sensor transport and storage / reject transport.
                        
            EXPLANATION/ACTION:
            – Clear the media jam between sensor and storage or reject transport.
            – Restart the CCDM.
                        
            EC:
            After passing RLS1, the banknote does not reach KLS2 to cassette module using specified path and tolerance.
            """),
    ERROR_500000("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
            """),
    ERROR_500330("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            Document jam at escrow unit ELS1.
                        
            Or diagnostic test triggered by operator: escrow unit defective.
            """),
    ERROR_500402("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            Malfunction of deflector.
            """),
    ERROR_500403("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            Document has over 2 cm transport slippage / document is jammed under ELS1.
            """),
    ERROR_500404("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            During unwinding one document is missing due to external intervention.
            """),
    ERROR_500405("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            Jam during unwinding; distance is greater than twice the maximum length of banknotes.
            """),
    ERROR_500406("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            Drive blocked, ESM1 motor not connected, motor logic defective, ELS3 fails to detect beginning of tape.
            """),
    ERROR_500600("""
            ERROR:
            Document jam at the escrow unit.
                        
            EXPLANATION/ACTION:
            – Perform a reset.
            – Clear the media jam in the escrow area.
            – Replace the escrow unit, if necessary.
                        
            EC:
            Banknote from escrow unit does not reach RLS1.
            """),
    ERROR_510000("""
            ERROR:
            Escrow tape defective.
                        
            EXPLANATION/ACTION:
            – Check the tape of the escrow unit.
            – Perform a reset.
            – Replace the escrow unit.
            """),
    ERROR_510400("""
            ERROR:
            Escrow tape defective.
                        
            EXPLANATION/ACTION:
            – Check the tape of the escrow unit.
            – Perform a reset.
            – Replace the escrow unit.
                        
            EC:
            Torn band or full drum; tape no longer under ELS2.
            """),
    ERROR_510401("""
            ERROR:
            Escrow tape defective.
                        
            EXPLANATION/ACTION:
            – Check the tape of the escrow unit.
            – Perform a reset.
            – Replace the escrow unit.
                        
            EC:
            Band torn; tape no longer under ELS2.
            """),
    ERROR_600065("""
            ERROR:
            Error at photosensor VLS10.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
            – If possible, check the photosensor using the product-specific software (e.g. KDIAG).
            – If the error persists, replace the dispenser module.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_610061("""
            ERROR:
            Error at photosensor VLS1.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_620064("""
            ERROR:
            Error at photosensor VLS7.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
            – If possible, check the photosensor using the product-specific software (e.g. KDIAG).
            – If the error persists, replace the dispenser module.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_630062("""
            ERROR:
            Error at photosensor VLS2.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_630077("""
            ERROR:
            Error at photosensor VLS12.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_640063("""
            ERROR:
            Error at photosensor VLS6.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
            – If possible, check the photosensor using the product-specific software (e.g. KDIAG).
            – If the error persists, replace the dispenser module.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_650075("""
            ERROR:
            Error at photosensor VLS11.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the dispenser module.
            """),
    ERROR_660068("""
            ERROR:
            Error at photosensor ALS3.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the alignment station.
            """),
    ERROR_670069("""
            ERROR:
            Error at photosensor ALS4.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the alignment station.
            """),
    ERROR_680067("""
            ERROR:
            Error at photosensor ALS2.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the alignment station.
            """),
    ERROR_690066("""
            ERROR:
            Error at photosensor ALS1.
                        
            EXPLANATION/ACTION:
            blinking:
            Cover of alignment station is not closed:
                        
            constant:
            – First check whether the cover of the alignment station is closed properly.
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the alignment station.
            """),
    ERROR_700071("""
            ERROR:
            Error at photosensor SLS3.
                        
            EXPLANATION/ACTION:
            blinking:
            Magnetic character reader not closed:
                        
            constant:
            – First check whether the magnetic character reader is closed properly.
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the magnetic character reader.
            """),
    ERROR_710070("""
            ERROR:
            Error at photosensor SLS1.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists replace the back panel incl. sensor and storage transport.
            """),
    ERROR_720072("""
            ERROR:
            Error at photosensor ELS1.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the escrow unit.
            """),
    ERROR_730076("""
            ERROR:
            Error at photosensor ELS5.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the escrow unit.
            """),
    ERROR_740073("""
            ERROR:
            Error at photosensor RLS1.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists replace the back panel incl. sensor and storage transport.
            """),
    ERROR_750074("""
            ERROR:
            Error at photosensor RLS2.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the reject transport.
            """),
    ERROR_800080("""
            ERROR:
            Error at photosensor KLS2.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the cassette module.
            """),
    ERROR_810081("""
            ERROR:
            Error at photosensor KLS3.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the cassette module.
            """),
    ERROR_820082("""
            ERROR:
            Error at photosensor KLS8.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the cassette module and/or cassette 2 (left cassette).
            """),
    ERROR_830083("""
            ERROR:
            Error at photosensor KLS11.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the cassette module and/or cassette 1 (right cassette).
            """),
    ERROR_840084("""
            ERROR:
            Error at photosensor KLS1_5.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the cassette module and/or cassette 1 (right cassette).
            """),
    ERROR_850085("""
            ERROR:
            Error at photosensor KLS2_5.
                        
            EXPLANATION/ACTION:
            blinking:
            – Carry out a photosensor adjustment / initialization.
                        
            constant:
            – If you can get to the photosensor, try to clean it.
            – Check the photosensor using KDIAG.
            – Synchronize the photosensors.
            – If the error persists, replace the cassette module and/or cassette 1 (right cassette).
            """),
    ERROR_900000("""
            ERROR:
            Deflector in sensor transport has wrong position.
                        
            EXPLANATION/ACTION:
            – Clear the media jam at the entry to the cassette module.
            – Remove the media jam in the cassette module – retract cassette / cassette 1 (right cassette) / cassette 2 (left cassette) (cassettes have to signed on again).
            – Restart the system.
            – Replace the cassette module, if necessary.
            """),
    ERROR_900603("""
            ERROR:
            Deflector in sensor transport has wrong position.
                        
            EXPLANATION/ACTION:
            – Clear the media jam at the entry to the cassette module.
            – Remove the media jam in the cassette module – retract cassette / cassette 1 (right cassette) / cassette 2 (left cassette) (cassettes have to signed on again).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Deflector in sensor transport has wrong position.
                        
            Or diagnostic test triggered by operator: cassette module defective.
            """),
    ERROR_900604("""
            ERROR:
            Deflector in sensor transport has wrong position.
                        
            EXPLANATION/ACTION:
            – Clear the media jam at the entry to the cassette module.
            – Remove the media jam in the cassette module – retract cassette / cassette 1 (right cassette) / cassette 2 (left cassette) (cassettes have to signed on again).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote does not quit KLS2 photosensor near module entrance using specified path + tolerance.
            """),
    ERROR_900606("""
            ERROR:
            Deflector in sensor transport has wrong position.
                        
            EXPLANATION/ACTION:
            – Clear the media jam at the entry to the cassette module.
            – Remove the media jam in the cassette module – retract cassette / cassette 1 (right cassette) / cassette 2 (left cassette) (cassettes have to signed on again).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote detected near module entrance (KLS2) does not reach KLS3 to retract cassette using specified path + tolerance.
            """),
    ERROR_900609("""
            ERROR:
            Deflector in sensor transport has wrong position.
                        
            EXPLANATION/ACTION:
            – Clear the media jam at the entry to the cassette module.
            – Remove the media jam in the cassette module – retract cassette / cassette 1 (right cassette) / cassette 2 (left cassette) (cassettes have to signed on again).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote detected near module entrance (KLS2) does not reach KLS8 to cassette 1 (right cassette) using specified path + tolerance.
            """),
    ERROR_900612("""
            ERROR:
            Deflector in sensor transport has wrong position.
                        
            EXPLANATION/ACTION:
            – Clear the media jam at the entry to the cassette module.
            – Remove the media jam in the cassette module – retract cassette / cassette 1 (right cassette) / cassette 2 (left cassette) (cassettes have to signed on again).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote detected near module entrance (KLS2) does not reach KLS11 to cassette 2 (left cassette) using specified path + tolerance.
            """),
    ERROR_910000("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
            """),
    ERROR_910614("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            – There is some paper left inside the deflector.
            – Motor not connected.
            – Hybrid photosensor before reset is defective.
                        
            Or diagnostic test triggered by operator: deflector (KSM5) in cassette module defective.
            """),
    ERROR_910618("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Deflector (cassette 1 / cassette 2) is not functioning.
                        
            Or diagnostic test triggered by operator: deflector (KSMx) in cassette module defective.
            """),
    ERROR_920000("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the direction of cassette 1 (right cassette).
            – Restart the system.
            – Replace the cassette module, if necessary.
            """),
    ERROR_920608("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the direction of cassette 1 (right cassette).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Incorrect position of deflector in cassette module.
            """),
    ERROR_920610("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the direction of cassette 1 (right cassette).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote does not quit KLS8 photosensor near entrance to cassette 1 using specified path + tolerance.
            """),
    ERROR_930000("""
            ERROR:
            Error in cassette 1.
                        
            EXPLANATION/ACTION:
            Permanent:
            – Remove the cassette 1 and empty it.
                        
            Blinking:
            – Check proper fit of cassette 1 (right cassette) and re-insert cassette 1 properly, if necessary.
            – Check the plug connection between the controller and the cassette module.
            – Restart the CCDM.
            – Replace cassette 1 (right cassette) or replace the entire cassette module, if necessary.
            """),
    ERROR_930615("""
            ERROR:
            Error in cassette 1.
                        
            EXPLANATION/ACTION:
            Permanent:
            – Remove the cassette 1 and empty it.
                        
            Blinking:
            – Check proper fit of cassette 1 (right cassette) and re-insert cassette 1 properly, if necessary.
            – Check the plug connection between the controller and the cassette module.
            – Restart the CCDM.
            – Replace cassette 1 (right cassette) or replace the entire cassette module, if necessary.
                        
            EC:
            – Stacker logic not connected (plug X1).
            – Stacker wheel in cassette 1 / cassette 2 is blocked.
            – Cassette 1 / cassette 2 not fully inserted (magnet on stacker wheel does not trigger Hall sensor).
            – Belt between stepper motor and stacker wheel has come off / is torn.
            – Home position magnet on stacker wheel is missing / has fallen off.
            – Hall sensor is defective / not connected.
            """),
    ERROR_940000("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the direction of cassette 2 (left cassette).
            – Restart the system.
            – Replace the cassette module, if necessary.
            """),
    ERROR_940611("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the direction of cassette 2 (left cassette).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Incorrect position of deflector in cassette module.
            """),
    ERROR_940613("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Clear the media jam in the direction of cassette 2 (left cassette).
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote does not quit KLS11 photosensor near entrance to cassette 2 using specified path + tolerance.
            """),
    ERROR_950000("""
            ERROR:
            Error in cassette 2.
                        
            EXPLANATION/ACTION:
            Permanent:
            – Remove the cassette 2 and empty it.
                        
            Blinking:
            – Check proper fit of cassette 2 (left cassette) and re-insert cassette 2 properly, if necessary.
            – Check the plug connection between the controller and the cassette module.
            – Restart the system.
            – Replace cassette 2 (left cassette) or replace the entire cassette module, if necessary.
            """),
    ERROR_950616("""
            ERROR:
            Error in cassette 2.
                        
            EXPLANATION/ACTION:
            Permanent:
            – Remove the cassette 2 and empty it.
                        
            Blinking:
            – Check proper fit of cassette 2 (left cassette) and re-insert cassette 2 properly, if necessary.
            – Check the plug connection between the controller and the cassette module.
            – Restart the system.
            – Replace cassette 2 (left cassette) or replace the entire cassette module, if necessary.
                        
            EC:
            """),
    ERROR_960000("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
            """),
    ERROR_960605("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Incorrect position of deflector in cassette module.
            """),
    ERROR_960607("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Banknote does not quit the photosensor near KLS33 entrance of retract cassette using the specified path + tolerance.
            """),
    ERROR_960617("""
            ERROR:
            Incorrect position of deflector in cassette module.
                        
            EXPLANATION/ACTION:
            – Check position of deflector in cassette module.
            – Check function of deflector in cassette module.
            – Perform a reset.
            – Restart the system.
            – Replace the cassette module, if necessary.
                        
            EC:
            Switching between retract cassettes is not functioning.
                        
            Or diagnostic test triggered by operator: deflector (KSMx) in cassette module defective.
            """);

    private final String description;
    CashInErrors(String description){
        this.description = description;
    }
    public String getDescription(){ return description;}
}
