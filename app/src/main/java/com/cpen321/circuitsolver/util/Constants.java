package com.cpen321.circuitsolver.util;

/**
 * Created by Neil Goossen on 2016-10-15.
 */

public final class Constants {
    public static final String IMAGE_LOCATION_KEY = "image_location_key";
    public static final String CIRCUIT_PROJECT_FOLDER = "circuit_projec_folder";
    public static final String OUTPUT_BITMAP = "hough_lines_output_bitmap";
    public static final String PROCESSING_DATA_LOCATION_KEY = "processing_data_location_key";
    public static final int CANVAS_MARGIN = 10; //leaves buffer space so that circuit components aren't right on the edge of the screen

    public static final int PROCESSING_WIDTH = 500;

    //TODO change many of these things to enum for type safety
    public static final String RESISTOR = "r";
    public static final String INDUCTOR = "l";
    public static final String CAPACITOR = "c";
    public static final String WIRE = "w";
    public static final String DC_VOLTAGE = "v";

    // unit types
    public static final String RESISTOR_UNITS = "ohms";
    public static final String INDUCTOR_UNTIS = "henrys";
    public static final String CAPACITOR_UNITS = "farads";
    public static final String VOLTAGE_UNITS = "volts";
    public static final String NOTHING_SELECTED = "--";
    public static final String WIRE_UNTIS = "--";


}
