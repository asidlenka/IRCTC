static void setAllCellBorders(XSLFTableCell cell, Color color) {
		cell.setBorderColor(BorderEdge.top, color);
		cell.setBorderColor(BorderEdge.right, color);
		cell.setBorderColor(BorderEdge.bottom, color);
		cell.setBorderColor(BorderEdge.left, color);
	}