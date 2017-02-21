package org.usfirst.frc.team2144.robot.commands.auto;

import org.usfirst.frc.team2144.robot.commands.ShooterShootVision;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ShooterAutoRed extends CommandGroup {

	public ShooterAutoRed() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
		System.out.print("Starting auto...");
		addSequential(new GyroFOD(1000, 0, 135, 0.5, 0.5), 10);
		System.out.println("Completed FOD.");
		addSequential(new ShooterShootVision());
	}
}
