package app.guitartext.ui.category.component;

import app.guitartext.scopes.ActivityScope;
import app.guitartext.ui.category.CategoryActivity;
import app.guitartext.ui.category.CategoryExpendableListAdapter;
import dagger.Subcomponent;

/**
 * Created by obywatel on 05.03.2017.
 * Modified by
 */

@ActivityScope
@Subcomponent(modules = CategoryActivityModule.class)
public interface CategoryActivityComponent
{
	void inject(CategoryActivity categoryActivity);

	CategoryExpendableListAdapter expendableListAdapter();
}
