package com.google.android.maps;

/**
 * Tile sources that have a settable "style" attibute can implement this. After
 * setting this on a tile provider, you may need to call clearTileCache() or
 * call setTileSource() again on the tile provider to clear the current tiles on
 * the screen that are still in the old style.
 */
public interface IStyledTileSource<T> {

	public T getStyle();

	public void setStyle(String style);

	public void setStyle(T style);
}
