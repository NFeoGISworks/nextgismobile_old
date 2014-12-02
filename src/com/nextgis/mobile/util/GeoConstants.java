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

public interface GeoConstants {

    /**
     * Mercator projection constants
     */
    public static final double MERCATOR_MAX = 20037508.34;

    /**
     * DataSource type
     */
    public final static int DS_TYPE_ZIP = 1;
    public final static int DS_TYPE_TMS = 2;
    public final static int DS_TYPE_LOCAL_GEOJSON = 3;
    public final static int DS_TYPE_LOCAL_NGFP = 4;

    /**
     * TMS type
     */
    public static final int TMSTYPE_NORMAL = 1;
    public static final int TMSTYPE_OSM = 2;

    public static final int DEFAULT_MAX_ZOOM = 25;
    public static final int DEFAULT_MIN_ZOOM = 0;

    /**
     * geometry type
     */
    public static final int GTPoint = 1;
    public static final int GTLineString = 2;
    public static final int GTPolygon = 3;
    public static final int GTMultiPoint = 4;
    public static final int GTMultiLineString = 5;
    public static final int GTMultiPolygon = 6;
    public static final int GTGeometryCollection = 7;
    public static final int GTNone = 100;

    /**
     * geojson
     * see http://geojson.org/geojson-spec.html
     */
    public static final String GEOJSON_TYPE = "type";
    public static final String GEOJSON_ID = "ID";
    public static final String GEOJSON_CRS = "crs";
    public static final String GEOJSON_NAME = "name";
    public static final String GEOJSON_PROPERTIES = "properties";
    public static final String GEOJSON_BBOX = "bbox";
    public static final String GEOJSON_TYPE_FEATURES = "features";
    public static final String GEOJSON_GEOMETRY = "geometry";
    public static final String GEOJSON_GEOMETRIES = "geometries";
    public static final String GEOJSON_COORDINATES = "coordinates";
    public static final String GEOJSON_TYPE_Point = "Point";
    public static final String GEOJSON_TYPE_MultiPoint = "MultiPoint";
    public static final String GEOJSON_TYPE_LineString = "LineString";
    public static final String GEOJSON_TYPE_MultiLineString = "MultiLineString";
    public static final String GEOJSON_TYPE_Polygon = "Polygon";
    public static final String GEOJSON_TYPE_MultiPolygon = "MultiPolygon";
    public static final String GEOJSON_TYPE_GeometryCollection = "GeometryCollection";
    public static final String GEOJSON_TYPE_Feature = "Feature";
    public static final String GEOJSON_TYPE_FeatureCollection = "FeatureCollection";

    /**
     * field type
     */
    public static final int FTInteger = 0;
    public static final int FTIntegerList = 1;
    public static final int FTReal = 2;
    public static final int FTRealList = 3;
    public static final int FTString = 4;
    public static final int FTStringList = 5;
    public static final int FTBinary = 8;
    public static final int FTDateTime = 11;

    /**
     * CRS
     */
    public static final int CRS_WGS84 = 4326;
    public static final int CRS_WEB_MERCATOR = 3857;

}
