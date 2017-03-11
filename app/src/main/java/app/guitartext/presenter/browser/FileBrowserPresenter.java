package app.guitartext.presenter.browser;

import java.util.List;

import app.guitartext.model.fileInfo.FileInfo;

/**
 * Created by obywatel on 08.03.2017.
 * Modified by
 */

public interface FileBrowserPresenter
{
	void fileSelected(int filePosition);

	void fileSelected(FileInfo fileInfo);

	interface View
	{
		void pathChanged(List<PathItem> path, List<FileInfo> pathContent);
	}
}