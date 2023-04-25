package kz.bs2.atmquickscan.enums;

public enum CashOutErrors {
    ERROR_01("""
            ERROR:
            Software faulty.
                        
            EXPLANATION/ACTION:
            Switch the device off and on again. Read the hardware status (StopInfo field), perform a download if necessary.
            """),
    ERROR_05("""
            ERROR:
            Communication problem with ChipCard controller.
                        
            EXPLANATION/ACTION:
            Check the lines to the ChipCard controller. Check ChipCard controller, replacing it if necessary.
            """),
    ERROR_06("""
            ERROR:
            Communication problem with ChipCard / or wrong ChipCard inserted (ChipCard number not '226-0PR').
                        
            EXPLANATION/ACTION:
            Check the ChipCard on the controller, replacing it if necessary.
            """),
    ERROR_09("""
            ERROR:
            Locking handle open CMD-V4 or VCMD is not in dispensing position.
                        
            EXPLANATION/ACTION:
            Push the CMD-V4 or VCMD as far as possible into the device using the green locking handle (CMD-V4 or VCMD must audibly click into place). If this should not be possible, then the locking switch must be checked and possibly recalibrated or replaced.
            """),
    ERROR_10("""
            ERROR:
            Controller defective or battery empty or battery jumper not connected: only with self-test commands for battery testing.
                        
            EXPLANATION/ACTION:
            Insert the battery jumper or replace the battery or replace the controller if the battery is permanently soldered in place.
            """),
    ERROR_11("""
            ERROR:
            No software (download).
                        
            EXPLANATION/ACTION:
            Perform a software download.
            """),
    ERROR_12("""
            ERROR:
            Safety switch open.
                        
            EXPLANATION/ACTION:
            Insert CMD-V4 or VCMD.
            """),
    ERROR_13("""
            ERROR:
            Device lock waiting.
                        
            EXPLANATION/ACTION:
            A retract has been performed during which the bank notes that were not removed by the customer have been deposited in the SAT. All transport functions of the CMD-V4 or VCMD have been blocked afterwards by the software. Remove the customer bank notes from the SAT, then use the product-specific software to reset the device lock (RESET inhibit flag).
            """),
    ERROR_14("""
            ERROR:
            CMD-V4 or VCMD minimum configuration is missing.
                        
            EXPLANATION/ACTION:
            Cassette is defective or absent. The CMD-V4 or VCMD requires at least one ready cash-out cassette and the reject/retract cassette (RR cassette) for operation. Insert the RR cassette and filled cash-out cassette(s) and register them using the product-specific software.
            """),
    ERROR_15("""
            ERROR:
            Cassette distributor board with invalid coding, not inserted or defective.
                        
            EXPLANATION/ACTION:
            Check the wiring to the cassette distributor board. Check the cassette distributor board and replace it if necessary.
            """),
    ERROR_16("""
            ERROR:
            Output transport coding invalid.
                        
            EXPLANATION/ACTION:
            Perform coding on the output transport cable connector.
            """),
    ERROR_17("""
            ERROR:
            CMD-V4: Belt drive of clamp defective (M3) or jam.
                        
            EXPLANATION/ACTION:
            Evaluate the error information in the device status. Initiate corresponding measures: e.g.: Replace the output transport or the controller.
            """),
    ERROR_18("""
            ERROR:
            Banknote jam during dispensing.
                        
            EXPLANATION/ACTION:
            A note jam has been discovered in the dispensing areas or in the vertical transports of the dispensing units or in the stacker during the dispensing transaction (photosensors PSDx, DDU, PS1, PS18). Check the banknote path from the cassettes up to the stacking compartment or the reject compartment for jammed notes. Check for correct seating of the plug connections on the CMD controller and/or on the elements of the photosensors. Afterwards, bring the CMD-V4 or the VCMD back into the safe into dispensing position, whereby the safety switch is closed and the CMD-V4 or VCMD is started up again (Reset). If the status display continues to show '18' after this start-up, then the jam was not effectively eliminated and/or another jam has occurred. Use the test program self-test command to check the 'Status of the photosensors'. If a photosensor (besides the 'cassette empty photosensor') is reported as being 'covered', determine the reason and eliminate the error. If no error can be determined and if '18' continues to be displayed after the next start-up, then the stacker, the respective dispensing unit or the controller must be replaced.
            """),
    ERROR_19("""
            ERROR:
            CMD-V4: Clamp transport defective/blocked. VCMD: Note jam in output transport.
                        
            EXPLANATION/ACTION:
            Clear the block and then perform a reset. Replace the stacker or the controller if necessary.
            """),
    ERROR_20("""
            ERROR:
            Single reject switch (MA2/1, MA2/2, SM1) defective/blocked.
                        
            EXPLANATION/ACTION:
            Check the SAT in the area of the single reject switch for jammed notes/note residue and remove them if found. Check the mobility of the single reject switch by pressing and releasing the rotor in the lift magnet MA2. Select Test function 2 (mechanical test) on the function button and watch the activation of the single reject switch. If the lift magnet MA2 does not move or if it does not move completely, the SAT or the controller must be replaced. If the magnet moves with a full stroke, then the CMD-V4 or the VCMD can be put back into operation. If the error occurs again after a short time, and if no reason can be determined following renewed inspection of the single reject switch, then the SAT or the controller must be replaced.
            """),
    ERROR_21("""
            ERROR:
            Faulty measuring station (DDU).
                        
            EXPLANATION/ACTION:
            Check whether there is a jam in the area of the measurement station. Are the cables connected? Replace dispensing unit with DDU or controller.
            """),
    ERROR_22("""
            ERROR:
            Photosensor amplifier faulty or photosensor initialization unsuccessful.
                        
            EXPLANATION/ACTION:
            Check all of the banknote paths from the cassettes to the stacking compartment, from the stacking compartment to the cash output and the input area of the RR cassette for jammed notes/note residues and remove these if found. Afterwards, bring the CMD-V4 or the VCMD back into the safe into dispensing position, whereby the safety switch is closed and the CMD-V4 or VCMD is started up again (Reset). If the status control shows '22' again after this start-up, then the controller must be replaced.
            """),
    ERROR_23("""
            ERROR:
            CMD-V4: Routing disk (SM2/SM3) defective/blocked. VCMD: Note bundle reject switch defective/blocked SM6.
                        
            EXPLANATION/ACTION:
            Clear block Move CMD-V4 or VCMD in the safe into dispensing position (safety switch closed) and select Test function 2 (mechanical test) on the function key after the start-up. If this test function ends once again with the status display '23', then the SAT or the controller must be replaced, otherwise the CMD-V4 or VCMD can be put back into operation.
            """),
    ERROR_24("""
            ERROR:
            CMD-V4: Reject/retract drive defective/blocked (MA6).
                        
            EXPLANATION/ACTION:
            The Reject/Retract chute selection in the RR cassette could not be set correctly. Remove the RR cassette and check the mobility of the retract box in the RR cassette. Check the connectors on the CMD controller and on the lift magnet MA6 for correct seating. Check the photosensor on the changeover lever for fixed seating. Move the CMD-V4 in the safe into dispensing position (safety switch closed). Re-insert the RR cassette and select Test function 2 (mechanical test) on the function key and monitor the movement of the RR drive (MA6). If the lift magnet does not move or if the end positions of the lever are not reached (status display '24' once again), then the output transport of the controller must be replaced.
            """),
    ERROR_25("""
            ERROR:
            Dispensing drive (DCM1) defective / blocked.
                        
            EXPLANATION/ACTION:
            The main motor (DCM 1) could no longer be brought up to its minimum rotational speed after a short start-up time. Select 1 (Reset) on the function key. The motor attempts to start up, but only labored operating noises are to be heard: check the bank note paths of the CMD-V4 or VCMD for a massive note jam. Check the input into the RR cassette to see if notes are jammed there. Move the CMD-V4 or the VCMD in the safe into dispensing position (safety switch closed) and select Text function 2 (mechanical test) on the function key after the startup of the CMD-V4 or VCMD: Observe the operating noises and transport function of the main motor. If the main motor does not rotate or if this test function ends again with the status display '25', the output transport or the controller must be replaced, otherwise the CMD-V4 or VCMD can be put back into operation.
            """),
    ERROR_26("""
            ERROR:
            CMD-V4: Stacker wheel drive (SM9) defective/blocked. VCMD: comb-type lifting bar defective/blocked (SM5) Dispensing / Transport changeover switch defective/blocked (M3).
                        
            EXPLANATION/ACTION:
            Check the SAT in the area of the stacking compartment for jammed notes/note residue and remove them if found. Move the CMD-V4 or the VCMD in the safe into dispensing position (safety switch closed) and select Text function 2 (mechanical test) on the function key after the start-up of the CMD-V4 or VCMD: If this test function ends once again with the status display '26', then the SAT or the controller must be replaced.
            """),
    ERROR_28("""
            ERROR:
            Shutter error.
                        
            EXPLANATION/ACTION:
            Check the output area of the CMD-V4 and of the shutter for foreign objects that prevent the movement of the shutter label. Move the CMD-V4 into dispensing position (safety switch closed). Select Test function 2 (mechanical test) on the function key and monitor the movement of the shutter. Troubleshooting can be performed on the shutter without danger even during ongoing test functions - afterwards, perform Test function 2 once again without operator intervention into the shutter movement. If this test ends once again with the status display '28', then the shutter or the controller must be replaced.
            """),
    ERROR_29("""
            ERROR:
            Output photosensor covered (manipulation).
                        
            EXPLANATION/ACTION:
            Check the cash output of the SAT and the shutter for foreign objects that interfere with the function of the output photosensor. Check the connector on the CMD-V4 or VCMD for correct seating. Resetting the error code: Firmware version <=16.80: Move the CMD-V4 or VCMD in the safe into dispensing position (safety switch closed) and select '1' (Reset) with the function key. If the status display reports '29' once again after the start-up of the CMD-V4 or VCMD, then the shutter, the SAT or the controller must be replaced. FW version >=16.80: Pull out the CMD-V4 or the VCMD and then slide it back in again (safety switch opened/closed) and then wait for the subsequent RESET. If the status display reports '29' once again after the start-up of the CMD-V4 or VCMD, then the shutter, the SAT or the controller must be replaced.
            """),
    ERROR_3X("""
            ERROR:
            Too many problems dispensing from cassette x (x = 1 - 6).
                        
            EXPLANATION/ACTION:
            Bundle rejects can be caused by extremely skewed banknotes or banknotes that are extracted in an uncontrolled way or by problems with the photosensors. This error can be ignored the first time it occurs (warning). If the error has however already occurred, then please proceed as follows:
            1. Remove cassette from the dispensing unit 'x' and check the bank note input: Are the front notes deformed on one side? Uniform pressure of the front notes on the right-hand and left-hand sides?
            2. With the cassette removed, check the dispensing area in the dispensing unit for jammed bank note residue.
            3. Check the transport path from cassette 'x' to the stacking compartment for jammed notes/note residue. Has a transport belt run off the rollers?
            4. Check the connectors on the CMD controller or VCMD and on the individual elements of the photosensors for correct seating.
            5. Check the stroke of the magnet for the retaining shaft for sluggish movement by pressing the rotor (or check the movement of the magnet with Test function 2 (mechanical test)).
                        
            If these tests reveal no errors and if the status '3x' continues to appear, then the respective dispensing unit or the controller must be replaced.
            """),
    ERROR_4X("""
            ERROR:
            No note dispensing possible or possibly faulty note contact pressure when deploying a new cassette (x = 1 - 6).
                        
            EXPLANATION/ACTION:
            A) No note could be extracted from cassette 'x' or B) The required contact pressure could not be built up when the cassettes were pushed inside.
                        
            Procedure in Case A):
            1. Remove cassette 'x' and check the note input: The notes must be standing vertically in the cassette. Are the front banknotes extremely deformed? If notes are curved, then the outward curve must face the pressure carriage! Are the front notes sticky or hooked into one another with kinks?
            2. With the cassette removed, check the dispensing area in the dispensing unit for jammed notes/bank note residue.
            3. Check the connectors on the CMD controller or VCMD and and on the coupling of the dispensing unit 'x' for correct seating.
            4. Afterwards, place filled cassette in dispensing unit 'x' and select '3' (Trial dispensing process) on the function button with the safety switch closed. If this test ends once again with the error code '4x', select Trial dispensing process once again, checking the function of the coupling and retaining shaft while doing so. If the coupling or the retaining magnet is not actuated, the dispensing unit or the controller must be replaced.
                        
            Procedure in Case B):
            1. Remove cassette 'x' and check the note input: The notes must be standing vertically in the cassette. Are the front banknotes extremely deformed? If notes are curved, then the outward curve must face the pressure carriage! If necessary, place notes from the rear part of the cassette towards the front. If the stack of notes rubs heavily against the side note guides (laterally protruding notes kinked to the rear) then the stack of notes needs to be aligned better.
            2. Reinsert the cassette. Does the pressure carriage move forward audibly when doing so?
            - If there is no noise to be heard, check the connectors on the CMD controller and the connectors on the cassette for correct seating. Carry out a test with a different cassette. If the motor still continues not to operate, then the controller is defective.
            - If the motor noise is audible, but the error message '4x' occurs again after a few seconds (together with a three-signal sound), then remove the cassette and check the stroke of the dispensing shaft manually for sluggish movement. Remove the cassette, open it, move it by hand into dispensing position. Check the movement of the return bar for sluggish movement.
            3. If no reason can be discerned and if this error also occurs with a different cassette in this dispensing unit, then the quality of the pressure sensor must be checked with test program and self-test command 'Query status cassette contact pressure' (DYQ) - If an error is present, then the dispensing unit or the controller must be replaced.
            """),
    ERROR_5X("""
            ERROR:
            Too many bad banknotes from cassette x (x = 1 - 6).
                        
            EXPLANATION/ACTION:
            Too many double or excessively wide or excessively narrow notes were detected during a dispense transaction from cassette 'x'. Remove cassette 'x' and check whether the correct note type was placed in it. Check the notes for deformations or stickiness. Reinsert the cassette and restart the application. If many 'good' notes are controlled out by Single Reject, or if the error '4x' reoccurs after a short time, then a new reference value determination should be carried out for this note type. If the error cannot be eliminated, then the dispensing unit or the controller must be replaced.
            """),
    ERROR_6X("""
            ERROR:
            Cassette x defective (x = 1 - 6).
                        
            EXPLANATION/ACTION:
            The note data stored in cassette 'x' could not be read and/or rewritten (writing error in the cassette EEPROM). Check the connectors on the CMD controller and the connectors on the cassette for correct seating. If the error also occurs with a different cassette in this dispensing unit, then the controller must be replaced.
            """),
    ERROR_70("""
            ERROR:
            Banknote measurement point (DDU) not ready.
                        
            EXPLANATION/ACTION:
            Check whether there is a jam in the area of the measurement station. Is the measurement station dirty or are the cables plugged in? Replace dispensing unit with DDU or controller.
            """),
    ERROR_7X("""
            ERROR:
            Dispensing sensor dirty or pressure sensor faulty (x = 1 - 6).
                        
            EXPLANATION/ACTION:
            A) If a cassette can be installed in cassette position 'x' without error (one-time signal tone), then the error message indicates an extremely soiled photosensor 'dispensing sensor' in the dispensing unit 'x' (PSDx) that must be cleaned. Afterwards, execute a reset (move CMD-V4 or VCMD into dispensing position).
                        
            Note: After the first time this error has occurred, the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling.
                        
            B) If it is not possible to deploy a cassette at cassette position 'x' (no signal tone, even after several seconds), then the dispensing unit or the controller must be replaced after checking the controllers on the CMD controller and on the pressure sensors (PSDx).
            """),
    ERROR_8X("""
            ERROR:
            Cassette empty sensor dirty (x = 1 - 6).
                        
            EXPLANATION/ACTION:
            Clean photosensor 'PSEx' in the respective dispensing unit and the associated prism in the pressure carriage of the cassette. Afterwards, execute a reset (move CMD-V4 or VCMD into dispensing position). Check the degree of soiling of all photosensors in KDIAG with the test program via self-test command 'DYK' (Query status photosensors, photosensor amplifiers): Photosensors that exhibit status '3' or higher should be cleaned. Status improvement can be queried after reset.
                        
            Note: After the first time this error has occurred, the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling.
            """),
    ERROR_90("""
            ERROR:
            SAT: Photosensor PS1 (P) dirty; stacker wheel input.
                        
            EXPLANATION/ACTION:
            Clean the transmission and reception diodes between the stacker wheels carefully with a brush. Return the CMD-V4 to dispensing position. If the status display continues to show the error code '90' after startup (Reset), remove the stacker and clean the surfaces of the prism from below, between the stacker wheels, return the CMD-V4 to dispensing position. If the status display continues to show the error code '90' after startup (Reset), then the stacker must be replaced. Check the degree of soiling of all photosensors in KDIAG with the test program via self-test command 'DYK' (Query status photosensors, photosensor amplifiers). Photosensors that exhibit status '3' or higher must be cleaned. Status improvement can be queried after the reset.
                        
            Note: After the first time this error has occurred, the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling.
            """),
    ERROR_91("""
            ERROR:
            Photosensor dirty. Tray monitoring: Photosensor PS18.
                        
            EXPLANATION/ACTION:
            Photosensor '9x' is soiled and urgently requires cleaning. Remove dust deposits on the surfaces of the respective transmitter/receiver (elements with clear or violetcolored plastic housing) and if necessary from the associated prism (P) (two crystal-clear surfaces opposite the transmitter/receiver) with a brush or compressed air. After cleaning, return the CMD-V4 or VCMD to home position and await start-up or select '1' (Reset) on the function button. Check the degree of soiling of all photosensors in KDIAG with the test program via self-test command 'DYK' (Query status photosensors, photosensor amplifiers): Photosensors that exhibit status '3' or higher must be cleaned. Status improvement can be queried after the reset. Remark: After the first occurrence of the error code '9x', the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling (the status display '9' will also be displayed in such cases).
            """),
    ERROR_93("""
            ERROR:
            CMD-V4: 'Compartment empty' (Single reject) PS2. VCMD: Monitoring of entrance reject box PS21.
                        
            EXPLANATION/ACTION:
            Photosensor '9x' is soiled and urgently requires cleaning. Remove dust deposits on the surfaces of the respective transmitter/receiver (elements with clear or violetcolored plastic housing) and if necessary from the associated prism (P) (two crystal-clear surfaces opposite the transmitter/receiver) with a brush or compressed air. After cleaning, return the CMD-V4 or VCMD to home position and await start-up or select '1' (Reset) on the function button. Check the degree of soiling of all photosensors in KDIAG with the test program via self-test command 'DYK' (Query status photosensors, photosensor amplifiers): Photosensors that exhibit status '3' or higher must be cleaned. Status improvement can be queried after the reset. Remark: After the first occurrence of the error code '9x', the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling (the status display '9' will also be displayed in such cases).
            """),
    ERROR_95("""
            ERROR:
            Removal photosensor. CMD-V4: PS27 (P). VCMD: PS26.\s
                        
            EXPLANATION/ACTION:
            Photosensor '9x' is soiled and urgently requires cleaning. Remove dust deposits on the surfaces of the respective transmitter/receiver (elements with clear or violetcolored plastic housing) and if necessary from the associated prism (P) (two crystal-clear surfaces opposite the transmitter/receiver) with a brush or compressed air. After cleaning, return the CMD-V4 or VCMD to home position and await start-up or select '1' (Reset) on the function button. Check the degree of soiling of all photosensors in KDIAG with the test program via self-test command 'DYK' (Query status photosensors, photosensor amplifiers): Photosensors that exhibit status '3' or higher must be cleaned. Status improvement can be queried after the reset. Remark: After the first occurrence of the error code '9x', the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling (the status display '9' will also be displayed in such cases).
            """),
    ERROR_9A("""
            ERROR:
            CMD-V4: Bundle rear edge control, Shutter photosensor PS 28.
                        
            EXPLANATION/ACTION:
            Photosensor '9x' is soiled and urgently requires cleaning. Remove dust deposits on the surfaces of the respective transmitter/receiver (elements with clear or violetcolored plastic housing) and if necessary from the associated prism (P) (two crystal-clear surfaces opposite the transmitter/receiver) with a brush or compressed air. After cleaning, return the CMD-V4 or VCMD to home position and await start-up or select '1' (Reset) on the function button. Check the degree of soiling of all photosensors in KDIAG with the test program via self-test command 'DYK' (Query status photosensors, photosensor amplifiers): Photosensors that exhibit status '3' or higher must be cleaned. Status improvement can be queried after the reset. Remark: After the first occurrence of the error code '9x', the CMD-V4 or VCMD can still continue working until the operation is automatically shut down with further increasing soiling (the status display '9' will also be displayed in such cases).
            """);

    private final String description;
    CashOutErrors(String description){
        this.description = description;
    }
    public String getDescription(){ return description;}
}
