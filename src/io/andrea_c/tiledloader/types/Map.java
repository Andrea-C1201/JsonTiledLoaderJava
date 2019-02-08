/*******************************************************************************
 * Copyright (C) 2019 Andrea-C1201
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package io.andrea_c.tiledloader.types;

import org.json.JSONArray;
import org.json.JSONObject;

public class Map {

	/**
	 * Optional Hex-formatted color (#RRGGBB or #AARRGGBB)
	 */
	private String backgroundColor;
	/**
	 * Number of tile rows
	 */
	private int height;
	/**
	 * Length of the side of a hex tile in pixels
	 */
	private int hexSidedLength;
	/**
	 * Whether the map has infinite dimensions
	 */
	private boolean infinite;
	/**
	 * Array of {@link Layer}s
	 */
	private Layer[] layers;
	/**
	 * Auto-increments for each layer
	 */
	private int nextLayerId;
	/**
	 * Auto-increments for each placed object
	 */
	private int nextObjectId;
	/**
	 * Value that specify the map type (orthogonal, isometric, staggered or
	 * hexagonal)
	 */
	private String orientation;
	/**
	 * A list of properties (name, value, type).
	 */
	// private Properties[] properties;
	/**
	 * Rendering direction (orthogonal maps only)
	 */
	private String renderOrder;
	/**
	 * x or y (staggered / hexagonal maps only)
	 */
	private String staggerAxis;
	/**
	 * odd or even (staggered / hexagonal maps only)
	 */
	private String staggerIndex;
	/**
	 * The Tiled version used to save the file
	 */
	private String tiledVersion;
	/**
	 * Map grid height
	 */
	private int tileHeight;
	/**
	 * Array of Tilesets
	 */
	private Tileset[] tilesets;
	/**
	 * Map grid width
	 */
	private int tileWidth;
	/**
	 * map (since 1.0)
	 */
	private String type;
	/**
	 * The JSON format version
	 */
	private String version;
	/**
	 * Number of tile columns
	 */
	private int width;

	/**
	 * Initialize this object
	 * 
	 * @param data The root node
	 */
	private void loadProperties(JSONObject data) {
		backgroundColor = data.getString("backgroundcolor");
		height = data.getInt("height");
		hexSidedLength = data.getInt("hexsidelength");
		infinite = data.getBoolean("infinite");
		// TODO layers array ("layers");
		nextLayerId = data.getInt("nextlayerid");
		nextObjectId = data.getInt("nextobjectid");
		orientation = data.getString("orientation");
		// TODO properties array ("properties");
		renderOrder = data.getString("renderorder");
		staggerAxis = data.getString("staggeraxis");
		staggerIndex = data.getString("staggerindex");
		tiledVersion = data.getString("tiledversion");
		tileHeight = data.getInt("tileheight");
		// TODO tilesets array ("tilesets");
		tileWidth = data.getInt("tilewidth");
		type = data.getString("type");
		version = data.getString("version");
		width = data.getInt("width");
	}

	/**
	 * Get all objects from a {@link JSONArray}
	 */
	private void dispatchJsonArray() {
		/* TODO */}

	/**
	 * @return the backgroundColor
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the hexSidedLength
	 */
	public int getHexSidedLength() {
		return hexSidedLength;
	}

	/**
	 * @return the infinite
	 */
	public boolean isInfinite() {
		return infinite;
	}

	/**
	 * @return the layers
	 */
	public Layer[] getLayers() {
		return layers;
	}

	/**
	 * @return the nextLayerId
	 */
	public int getNextLayerId() {
		return nextLayerId;
	}

	/**
	 * @return the nextObjectId
	 */
	public int getNextObjectId() {
		return nextObjectId;
	}

	/**
	 * @return the orientation
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * @return the renderOrder
	 */
	public String getRenderOrder() {
		return renderOrder;
	}

	/**
	 * @return the staggerAxis
	 */
	public String getStaggerAxis() {
		return staggerAxis;
	}

	/**
	 * @return the staggerIndex
	 */
	public String getStaggerIndex() {
		return staggerIndex;
	}

	/**
	 * @return the tiledVersion
	 */
	public String getTiledVersion() {
		return tiledVersion;
	}

	/**
	 * @return the tileHeight
	 */
	public int getTileHeight() {
		return tileHeight;
	}

	/**
	 * @return the tilesets
	 */
	public Tileset[] getTilesets() {
		return tilesets;
	}

	/**
	 * @return the tileWidth
	 */
	public int getTileWidth() {
		return tileWidth;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

}