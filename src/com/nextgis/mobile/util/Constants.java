/******************************************************************************
 * Project:  NextGIS mobile
 * Purpose:  Mobile GIS for Android.
 * Author:   Dmitry Baryshnikov (aka Bishop), polimax@mail.ru
 ******************************************************************************
*   Copyright (C) 2014 NextGIS
*
*    This program is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 2 of the License, or
*    (at your option) any later version.
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ****************************************************************************/
package com.nextgis.mobile.util;

public interface Constants {
	public static final String PREFS_TILE_SOURCE = "map_tile_source";	
	public static final String PREFS_SCROLL_X = "map_scroll_x";
	public static final String PREFS_SCROLL_Y = "map_scroll_y";
	public static final String PREFS_ZOOM_LEVEL = "map_zoom_level";
	public static final String PREFS_SHOW_LOCATION = "map_show_loc";
	public static final String PREFS_SHOW_COMPASS = "map_show_compass";
	public static final String PREFS_SHOW_INFO = "map_show_info";
    public static final String PREFS_MAP = "map";
	
	public static final String KEY_PREF_STORAGE_SITE = "storage_site";
	public static final String KEY_PREF_USER_ID = "user_id";
	public static final String KEY_PREF_MIN_DIST_CHNG_UPD = "min_dist_change_for_update";
	public static final String KEY_PREF_MIN_TIME_UPD = "min_time_beetwen_updates";
	public static final String KEY_PREF_SW_TRACK_SRV = "sw_track_service";
	public static final String KEY_PREF_SW_TRACKGPX_SRV = "sw_trackgpx_service";
	public static final String KEY_PREF_SHOW_LAYES_LIST = "show_layers_list";
	public static final String KEY_PREF_SW_SENDPOS_SRV = "sw_sendpos_service";
	public static final String KEY_PREF_SW_ENERGY_ECO = "sw_energy_economy";
	public static final String KEY_PREF_TIME_DATASEND = "time_between_datasend";
	public static final String KEY_PREF_COORD_FORMAT = "coordinates_format";
	public static final String KEY_PREF_START_SVC_ON_STARTUP = "start_services_on_startup";
	public static final String KEY_PREF_ACCURATE_LOC = "accurate_coordinates_pick";
	public static final String KEY_PREF_ACCURATE_GPSCOUNT = "accurate_coordinates_pick_count";
	public static final String KEY_PREF_ACCURATE_CE = "accurate_type";	
	public static final String KEY_PREF_TILE_SIZE = "map_tile_size";
	public static final String KEY_PREF_COMPASS_VIBRO = "compass_vibration";
	public static final String KEY_PREF_COMPASS_TRUE_NORTH = "compass_true_north";
	public static final String KEY_PREF_COMPASS_SHOW_MAGNET = "compass_show_magnetic";
	public static final String KEY_PREF_COMPASS_WAKE_LOCK = "compass_wake_lock";
	public static final String KEY_PREF_USER_LEARNED_DRAWER = "layers_drawer_learned";
    public static final String KEY_PREF_MAP_PATH = "map_path";

	public static final String SERVICE_PREF = "preferences";

	public static final int MAP_RELATIVE_LAYOUT = 777;

    public final static String LOACTION_HINT = "com.nextgis.gis.location";
    public final static String TAG = "nextgismobile";

    public static final int MAX_DRAWLER_WIDTH = 750;

    public final static int DS_TYPE_ZIP = 0;

    public static final String MAP_CONFIG = "map.json";
    public static final String LAYER_CONFIG = "layer.json";
    public static final String LAYER_PREFIX = "layer_";
    public static final String TILE_EXT = ".tile";

    public static final String BUNDLE_MSG_KEY = "msg";
    public static final String BUNDLE_HASERROR_KEY = "has_error";
    public static final String BUNDLE_SRC_KEY = "source";
    public static final String BUNDLE_PATH_KEY = "path";

    public static final String JSON_NAME_KEY = "name";
    public static final String JSON_VISIBILITY_KEY = "visible";
    public static final String JSON_TMSTYPE_KEY = "tms_type";
    public static final String JSON_LEVELS_KEY = "levels";
    public static final String JSON_LEVEL_KEY = "level";
    public static final String JSON_TYPE_KEY = "type";
    public static final String JSON_MAXX_KEY = "maxx";
    public static final String JSON_MINX_KEY = "minx";
    public static final String JSON_MAXY_KEY = "maxy";
    public static final String JSON_MINY_KEY = "miny";
    public static final String JSON_MAXLEVEL_KEY = "max_level";
    public static final String JSON_MINLEVEL_KEY = "min_level";
    public static final String JSON_LAYERS_KEY = "layers";
    public static final String JSON_LAYER_KEY = "layer";
    public static final String JSON_PATH_KEY = "path";
    public static final String JSON_MAP_KEY = "map";

    public static final int LAYERTYPE_LOCAL_TMS = 1;
    public static final int LAYERTYPE_LOCAL_RASTER = 2;
    public static final int LAYERTYPE_LOCAL_GEOJSON = 3;
    public static final int LAYERTYPE_TMS = 4;
    public static final int LAYERTYPE_NGW = 5;

    public static final int TMSTYPE_NORMAL = 1;
    public static final int TMSTYPE_OSM = 2;
}